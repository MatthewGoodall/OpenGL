package renderEngine;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;


public class DisplayManager {

	
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	public static final int FPS_CAP = 120;
	
	
	public static void CreateDisplay() {
		
		ContextAttribs attrib = new ContextAttribs(3,2).withForwardCompatible(true).withProfileCore(true);
		
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			Display.create(new PixelFormat(), attrib);
			Display.setTitle("Hello World!");
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GL11.glViewport(0, 0, WIDTH, HEIGHT);
	}
	
	public static void UpdateDisplay() {
		
		Display.sync(FPS_CAP);
		Display.update();
		
	}
	
	public static void CloseDisplay() {
		
		Display.destroy();
		
	}
	
}
