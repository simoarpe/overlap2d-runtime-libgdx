package com.uwsoft.editor.renderer.components;

import com.badlogic.ashley.core.Component;

public class ZIndexComponent implements Component {
    public boolean needReOrder = false;
    public String layerName = "";
    public int layerIndex;
    private int zIndex = 0;

    public int getZIndex() {
        return zIndex;
    }

    public void setZIndex(int zIndex) {
        this.zIndex = zIndex;
        needReOrder = true;
    }

}