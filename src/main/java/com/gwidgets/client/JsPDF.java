package com.gwidgets.client;


import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true,name = "jsPDF", namespace = JsPackage.GLOBAL)
public class JsPDF {

  public native void text(String text, int posicionX, int posicionY);
  public native void setFontSize(int value);
  public native void setTextColor(int value);
  public native void autoTable(DataConfig dataConfig);
  public native void save(String namePdf);
}