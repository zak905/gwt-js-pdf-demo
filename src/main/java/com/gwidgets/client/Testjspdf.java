package com.gwidgets.client;

import com.google.gwt.core.client.EntryPoint;

public class Testjspdf implements EntryPoint {
  public void onModuleLoad() {

    DataConfig dataConfig=new DataConfig();
    dataConfig.head=new String[][]{new String[]{"Nombres y Apellidos","DNI","Sexo"}};
    dataConfig.body=new Object[][]{new Object[]{"Carlos Alberto Borda",40786863,"M"}, new Object[]{"Jhon Choequnaira Ttito",40786863,"M"}, new Object[]{"Fahed Hermoza",40786863,"M"}};
    //dataConfig.addStyleDef(StyleDef.overflow,"ellipsize");
    //dataConfig.addStyleDef(StyleDef.cellWidth,"wrap");
    dataConfig.startY=7;

    JsPDF js = new JsPDF();

    js.text("Pueba generacion PDF",10,5);
    js.setFontSize(12);
    js.setTextColor(5);
    js.autoTable(dataConfig);

   //Click Button
    js.save("generacion-demo.pdf");
  }
}