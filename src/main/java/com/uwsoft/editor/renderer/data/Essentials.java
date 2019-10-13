package com.uwsoft.editor.renderer.data;

import com.box2dLight.RayHandler;

import com.badlogic.gdx.physics.box2d.World;
import com.uwsoft.editor.renderer.resources.IResourceRetriever;

public class Essentials {

    public RayHandler rayHandler;
    //public SkeletonRenderer skeletonRenderer;
    public IResourceRetriever rm;
    public World world;
    public boolean physicsStopped = false;

}
