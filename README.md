## overlap2d-runtime-libgdx

The overlap2d-runtime-libgdx provides functionality to load, manipulate and render scenes generated by [Overlap2DX](https://github.com/simoarpe/overlap2d) Editor.
To be used with libGDX projects. Thanks to roboVM this will work also on iOS.

Overlap2DX runtime is based on [Ashley](https://github.com/libgdx/ashley) entity component system, which is also supported by libGDX.

## Setting Up

~If you are using gradle, yo can just add this line to your dependecies:~

~`compile "com.underwaterapps.overlap2druntime:overlap2d-runtime-libgdx:0.1.2-SNAPSHOT`~

Otherwise clone this project, and include it in your project.

**Important:** Make sure you also have libGDX, and free type fonts library in your dependencies.

When creating new project, why not use libGDX setup app? Here are the instructions:
https://libgdx.badlogicgames.com/download.html

### Using Spine with your Overlap2DX runtime
Spine is not included by default, instead it's kind of an external plugin. Because Spine runtime is not in maven, here is the hell you have to go throguh:
1) Get spine runtime for it's official github, and make sure it is included in your project.
2) Add this to your settings.gradle:

    $ include 'spine-o2d-extension'
    $ project(':spine-o2d-extension').projectDir = new File(settingsDir, 'overlap2d-runtime-libgdx/extensions/spine')
3) in your build.gradle, add this:
```groovy
    project(":spine-o2d-extension") {
        apply plugin: "java"
        sourceSets.main.java.srcDirs = ["src/"]

        dependencies {
            compile project(":spine-runtime-libgdx");
            compile project(":overlap2d-runtime-libgdx");
            compile fileTree(dir: 'libs', include: '*.jar')
        }
    }
```
Also add this to dependencies:
    $ compile project(":spine-o2d-extension")

Also, after initializing scene loader, add:
    $ sceneLoader.injectExternalItemType(new SpineItemType());


## Getting started
After you are all setup, and assets are exported, here is a sample code to get things rendered

in your create method:

```java
viewport = new FitViewport(800, 480); // this should be the size of camera in WORLD units. make sure you check that in editor first.
    sl = new SceneLoader(); // default scene loader loads allr esources from default RM as usual.
    sl.loadScene("MainScene", viewport); // loading scene as usual
```

in your draw method:

```java
Gdx.gl.glClearColor(0, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    sl.getEngine().update(Gdx.graphics.getDeltaTime()); // getting the ashley engine and updating it (it will render things with it's own render system)
```
