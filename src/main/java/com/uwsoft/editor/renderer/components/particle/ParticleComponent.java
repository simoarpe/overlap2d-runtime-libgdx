package com.uwsoft.editor.renderer.components.particle;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;

public class ParticleComponent implements Component {
    public String particleName = "";
    public ParticleEffect particleEffect;
    public float worldMultiplier = 1f;
    private float scaleFactor = -1f;

    public void scaleEffect(float scale) {
        if (scale == scaleFactor) {
            // There is no need to re-apply the scale factor if it's the same.
            return;
        }

        scaleFactor = scale;
        particleEffect.reset(true);
        particleEffect.scaleEffect(scaleFactor * worldMultiplier);
    }

    public float getScaleFactor() {
        return scaleFactor;
    }
}
