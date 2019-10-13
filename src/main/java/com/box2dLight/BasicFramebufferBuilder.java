package com.box2dLight;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.FrameBuffer;
import com.badlogic.gdx.graphics.glutils.GLFrameBuffer;

public class BasicFramebufferBuilder extends GLFrameBuffer.FrameBufferBuilder {

    protected boolean keepColourTextures;

    public BasicFramebufferBuilder(int width, int height) {
        super(width, height);
    }

    public void keepColorTextures (boolean keepColorTextures) {
        this.keepColourTextures = keepColorTextures;
    }

    @Override
    public FrameBuffer build () {
        return new FrameBuffer(this) {
            @Override
            protected void disposeColorTexture (Texture colorTexture) {
                if (!keepColourTextures) {
                    super.disposeColorTexture(colorTexture);
                }
            }
        };
    }

    /**
     * Helper method to create a basic frame buffer compatible with the previous version changed in LibGdx 1.9.7
     */
    public static FrameBuffer createBasicExtended (Pixmap.Format format, int width, int height, boolean hasDepth, boolean hasStencil, boolean keepColorTextures) {
        BasicFramebufferBuilder frameBufferBuilder = new BasicFramebufferBuilder(width, height);
        frameBufferBuilder.addBasicColorTextureAttachment(format);
        frameBufferBuilder.keepColorTextures(keepColorTextures);
        if (hasDepth) frameBufferBuilder.addDepthRenderBufferAttachment();
        if (hasStencil) frameBufferBuilder.addStencilRenderBufferAttachment();
        return frameBufferBuilder.build();
    }
}