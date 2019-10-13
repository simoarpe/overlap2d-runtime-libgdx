package com.uwsoft.editor.extension.spine;/*
 * ******************************************************************************
 *  * Copyright 2015 See AUTHORS file.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *  *****************************************************************************
 */

import com.badlogic.ashley.systems.IteratingSystem;
import com.badlogic.gdx.physics.box2d.World;
import com.box2dLight.RayHandler;
import com.uwsoft.editor.renderer.commons.IExternalItemType;
import com.uwsoft.editor.renderer.factory.EntityFactory;
import com.uwsoft.editor.renderer.factory.component.ComponentFactory;
import com.uwsoft.editor.renderer.resources.IResourceRetriever;
import com.uwsoft.editor.renderer.systems.render.logic.Drawable;

/**
 * Spine dummy type.
 */
public class SpineItemType implements IExternalItemType {
    @Override
    public int getTypeId() {
        return EntityFactory.DUMMY_TYPE;
    }

    @Override
    public Drawable getDrawable() {
        return null;
    }

    @Override
    public IteratingSystem getSystem() {
        return null;
    }

    @Override
    public ComponentFactory getComponentFactory() {
        return null;
    }

    @Override
    public void injectMappers() {
        // No-op.
    }

    @Override
    public void injectDependencies(RayHandler rayHandler, World world, IResourceRetriever rm) {
        // No-op.
    }
}
