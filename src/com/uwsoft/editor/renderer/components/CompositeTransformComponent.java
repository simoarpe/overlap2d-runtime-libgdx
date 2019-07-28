package com.uwsoft.editor.renderer.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Affine2;
import com.badlogic.gdx.math.Matrix4;

public class CompositeTransformComponent implements Component {
    public final Affine2 worldTransform = new Affine2();
    public final Matrix4 computedTransform = new Matrix4();
    public final Matrix4 oldTransform = new Matrix4();
    public boolean automaticResize = false;
    public boolean transform = false;
}
