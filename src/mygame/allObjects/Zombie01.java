/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame.allObjects;

import com.jme3.animation.AnimControl;
import com.jme3.asset.AssetManager;
import com.jme3.bullet.collision.PhysicsCollisionObject;

import com.jme3.scene.Node;
import com.jme3.bullet.control.RigidBodyControl;
import com.jme3.light.AmbientLight;

/**
 *
 * @author DELL
 */
public class Zombie01 extends Zombie 
{
private final AssetManager  assetManager;
//private final AnimEventListener listener;`
     public Zombie01(AssetManager  asset ) {
       
         super(asset);
        assetManager=asset;
       
            Node node= (Node)assetManager.loadModel("Blender/zombie.j3o");
            name="Yaku_zombie";
            node=(Node)node.getChild(name);
            this.node=node;
        this.node.setName("zombie");
            this.node.addLight(new AmbientLight());
         phyControl=new RigidBodyControl(0);
        // phyControl.removeCollideWithGroup(PhysicsCollisionObject.COLLISION_GROUP_02);  
        
         phyControl.setCollisionGroup(PhysicsCollisionObject.COLLISION_GROUP_01);
         phyControl.addCollideWithGroup(PhysicsCollisionObject.COLLISION_GROUP_01);
       
         
         this.node.addControl(phyControl);
        
            control = node.getControl(AnimControl.class);
            channal=control.createChannel();
         phyControl.activate();
       
     
     }
    
}
