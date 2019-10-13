package com.uwsoft.editor.extension.spine;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.utils.Array;

public class SpineObjectComponent implements Component {
    public Array<String> getAnimationNames() {
        return new Array<>(1);
    }

    public void setAnimation(String animName) {
    }
}
