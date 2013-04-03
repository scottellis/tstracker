QT += core gui

TEMPLATE = app

TARGET = tstracker

SOURCES += main.cpp \
           tstracker.cpp

HEADERS += tstracker.h

FORMS += tstracker.ui

target.path = /usr/bin
INSTALLS += target

