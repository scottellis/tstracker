## tstracker

A simple Qt app for tracking touchscreen pointer movements.

Used for debugging a Gumstix Overo touchscreen driver.

### Build natively

    $ qmake && make
     

### Build with Yocto/OE

A bitbake recipe can be found in the [meta-overo][meta-overo] Yocto
layer. Find it here

    meta-overo/recipes-qt/qt4/tstracker/tstracker.bb

 
It has a dependency on `qt4e`. Change this as appropriate if you
are using the X11 version of Qt4.


### Run

Assuming Qt4 embedded, run it from a shell and as you touch/move around
the display, you will see the X,Y coordinates of the last move event.

    $ tstracker -qws

The app displays fullscreen when run on a Qt4 embedded system.


[meta-overo]: https://github.com/jumpnow/meta-overo

