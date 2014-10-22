## tstracker

A simple Qt app for tracking touchscreen pointer movements.

Used for debugging a Gumstix Overo touchscreen driver.

### Build natively

    $ qmake && make
     

### Build with Yocto/OE

There is a bitbake recipe file included with the project.
It has a dependency on `qt4e`. Change this as appropriate if you
are using the X11 version of Qt4 or if you are using Qt5.

### Run

Assuming Qt4 embedded, run it from a shell and as you touch/move around
the display, you will see the X,Y coordinates of the last move event.

    $ tstracker -qws

The app displays fullscreen when run on a Qt4 embedded system.

