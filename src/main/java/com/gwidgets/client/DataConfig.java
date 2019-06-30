package com.gwidgets.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name="Object", namespace = JsPackage.GLOBAL)
public class DataConfig {

  public String [][] head;
  public Object [][] body;
  public int startY;

}
