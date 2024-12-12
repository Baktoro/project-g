package com.project.projectg.input;

public class Controller {
	public double x, y, z, rotation, xa, za, rotationa;
	public static boolean turnRight,turnLeft = false;
	
	
	public void tick(boolean forward,boolean back,boolean right,boolean left,boolean jump){
		double rotationSpeed = 0.015;
		double walkSpeed = 1;
		double jumpHeight = 0.5;
		double xMove = 0;
		double zMove =0;
		
		if(forward){
			zMove=walkSpeed;
		}
        if(back){
			zMove = -walkSpeed;
		}
        if(right){
			xMove = walkSpeed;
		}
        if(left){
        	xMove = -walkSpeed;
        }
        if(turnRight){
        	rotationa += rotationSpeed;
        }
        if(turnLeft){
        	rotationa -= rotationSpeed;
		}
        if(jump){
        	y += jumpHeight;
        }
        
        xa+=(xMove * Math.cos(rotation) + zMove * Math.sin(rotation)) * walkSpeed;
        za+=(zMove * Math.cos(rotation) - xMove * Math.sin(rotation)) * walkSpeed;
        x+=xa;
        y*=0.9;
        z+=za;
        xa *= 0.1;
        za *= 0.1;
        rotation += rotationa;
        rotationa *= 0.8;
	}
}
