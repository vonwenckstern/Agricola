/*******************************************************************************
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package de.tu_freiberg.informatik.vonwenckstern.client;

import java.util.ArrayList;
import java.util.Random;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Snake implements EntryPoint, KeyDownHandler, ClickHandler {
	private ArrayList<Point> snakeList = new ArrayList<Point>();
	private int keyCode = 39;
	private boolean lost = false;
	private Point food = new Point(25, 25);
	private Random rand = new Random();
	private HTML html = new HTML();
	private Button btn = new Button("Reset");
	private FocusPanel fp = new FocusPanel(html);
	
	public boolean isDrawn(int x, int y) {
		return snakeList.contains(new Point(x,y));
	}
	
	public boolean isFood(int x, int y) {
		return food.equals(new Point(x,y));
	}
	
	public void onModuleLoad() {
		snakeList.add(new Point(2, 0));
		snakeList.add(new Point(1, 0));
		snakeList.add(new Point(0, 0));
		fp.addKeyDownHandler(this);
		btn.addClickHandler(this);
		RootPanel.get().add(new HTML("<h1>Snake</h1>"));
		RootPanel.get().add(fp);
		RootPanel.get().add(btn);
		fp.setFocus(true);
		Timer t = new Timer() {
			@Override
			public void run() {
				if(!lost) {
					timer();
					render();
				}
			}
		};
		render();
		t.scheduleRepeating(100);
	}
	
	public void timer() {
		if(lost)
			return;
		Point fp = snakeList.get(0).clone();
		switch(keyCode) {
		case 37: fp.x = fp.x - 1; break;
		case 38: fp.y = fp.y - 1; break;
		case 39: 
		default: fp.x = fp.x + 1; break;
		case 40: fp.y = fp.y + 1; break;
		}
		if(fp.equals(food)) {
			do {
				int x = rand.nextInt(50);
				int y = rand.nextInt(50);
				food = new Point(x, y);
			} while(snakeList.contains(food));
		} else {
			snakeList.remove(snakeList.size()-1);
		}
		if(snakeList.contains(fp) || fp.x < 0 || fp.x > 49 || fp.y < 0 || fp.y > 49) {
			lost = true;
		} else {
			snakeList.add(0, fp);
		}
	}
	
	public void render() {
		html.setHTML(getImage());
	}
	
	public String getImage() {
		StringBuilder sb = new StringBuilder();
		sb.append("<table cellspacing=\"0\" cellpadding=\"0\" style=\"border: 2px solid black;\">");
		for(int y=0; y<50; y++) {
			sb.append("<tr>");
			for(int x=0; x<50; x++) {
				sb.append("<td>");
				sb.append("<div style=\"width: 5px; height: 5px; background-color: ").append(isDrawn(x, y)?"black":isFood(x,y)?"red":"white").append(";\"></div>");
				sb.append("</td>");
			}
			sb.append("</tr>");
		}
		sb.append("</table>");
		if(lost) {
			sb.append("<div style=\"color: red;\">You lost!</div>");
		}
		return sb.toString();
	}
	
	public static class Point {
		public Point clone() {
			return new Point(x,y);
		}
		public Point(int x, int y) { this.x = x; this.y = y; }
		public boolean equals(Object o) {
			if( !(o instanceof Point)) {
				return false;
			}
			Point p = (Point)o;
			return p.x == x && p.y == y;
		}
		public int x;
		public int y;
	}

	@Override
	public void onKeyDown(KeyDownEvent event) {
		keyCode = event.getNativeKeyCode();
	}

	@Override
	public void onClick(ClickEvent event) {
		keyCode = 39;
		snakeList.clear();
		snakeList.add(new Point(2, 0));
		snakeList.add(new Point(1, 0));
		snakeList.add(new Point(0, 0));
		lost = false;
		food = new Point(25, 25);
		fp.setFocus(true);
	}
}
