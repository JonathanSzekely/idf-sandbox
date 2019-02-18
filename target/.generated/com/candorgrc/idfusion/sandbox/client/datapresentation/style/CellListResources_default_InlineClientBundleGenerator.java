package com.candorgrc.idfusion.sandbox.client.datapresentation.style;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CellListResources_default_InlineClientBundleGenerator implements com.candorgrc.idfusion.sandbox.client.datapresentation.style.CellListResources {
  private static CellListResources_default_InlineClientBundleGenerator _instance0 = new CellListResources_default_InlineClientBundleGenerator();
  private void cellListSelectedBackgroundInitializer() {
    cellListSelectedBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "cellListSelectedBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?externalImage_rtl : externalImage),
      0, 0, 82, 26, false, false
    );
  }
  private static class cellListSelectedBackgroundInitializer {
    static {
      _instance0.cellListSelectedBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return cellListSelectedBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource cellListSelectedBackground() {
    return cellListSelectedBackgroundInitializer.get();
  }
  private void cellListStyleInitializer() {
    cellListStyle = new com.candorgrc.idfusion.sandbox.client.datapresentation.style.CellListStyle() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "cellListStyle";
      }
      public String getText() {
        return ("");
      }
      public java.lang.String cellListEvenItem() {
        return "cellListEvenItem";
      }
      public java.lang.String cellListKeyboardSelectedItem() {
        return "cellListKeyboardSelectedItem";
      }
      public java.lang.String cellListOddItem() {
        return "cellListOddItem";
      }
      public java.lang.String cellListSelectedItem() {
        return "cellListSelectedItem";
      }
      public java.lang.String cellListWidget() {
        return "cellListWidget";
      }
    }
    ;
  }
  private static class cellListStyleInitializer {
    static {
      _instance0.cellListStyleInitializer();
    }
    static com.candorgrc.idfusion.sandbox.client.datapresentation.style.CellListStyle get() {
      return cellListStyle;
    }
  }
  public com.candorgrc.idfusion.sandbox.client.datapresentation.style.CellListStyle cellListStyle() {
    return cellListStyleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,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";
  private static final java.lang.String externalImage_rtl = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAFIAAAAaCAYAAAAkJwuaAAAHcElEQVR4Xu1SWXdWRRC8PxWC7IrgAhzBY1BAlnwEAihwXEFRUNkJ/JCwh0VZBAVJCMvjOFXVPdN38vGkjzz06a2quuae241feJnGL75KuyZfMsYvvErjod6dd9ij9lkv225o+N4w1JrMOe5Zh1veN7rFG+JixfbmQQ9791dq40adeKN3K3CqL3F6N3n3VeoGeTiYfJGQ/WN6YF77Vz2c6rqP8ziLuAE1fN7q176vIX70F2f1brw538vrblSt6NP38Y19H+2+Gzv3nM3Y+ecMgj3n3dg526E+/4J5cF6Y0ht/cH7OODZjPWdaVcd30gj95Fzu54xXwzW9HkyKh/viuD/zRM36FmnbPcfxvnvEzO8qc8d9wJyzb1Pu2MfNfbfz7FzacXou7Tz7LO3IgZ4zmzOfaeI0sIY7o7wT2ffGL/tzVpte0Q/8kgOPd8DxG4xnxYf65/RdZ8+qjxDlpvkr7+QOGjYPfqK3yO3NLbptp2cT49SztD0b//zkLGMb6jzDfNvpGfbI3J2aJRaz7acMf0oawpkmwrS44z7i/bZj8s50pI+7M+KBA2+ONX314AgH7e3FB/jyynnjR1y9jZis4e/adtLebJ78jr7PDLHU4rtmU7c1N1tOPk1bf1NszrHF48RT7jSbKfNef0I8Ym1HLej6Ph/mHrXhNFe/9YTtqTkjPyfVbz0xyz0zetvRg2lKa5Z3qMf71a97Y0CXGGF9zhp3wl3vN9tb+U73Hvsc3ae//pM+y1HyL6if1L7kJ8zCPCHO8ZpXTsFFbtEV1/V8VmrsuA9+/FbvXt3FfcH53mYM6+MbW23kTcfD+3t799l/I6L75Oe/0+ixJwm5xLE8Ox77xzk/zrPHdXesYrEDZpPtyzzPRr3HHezLnapHfWZ4MV5+DO6oryGv0ik71zsGTr1JDXBMy7GjxnW+16P0BE6Ncsduxl48fZtu49GH6eOfHimO/pWzYmOuN/74MMcjq4Vhjzl4NueeXNTgoAfGNLAz7Q3QcbyFcKjBtxvM8GYY8jADXvUG7ANHe/nRO+C5evdaHuHLvYirW3aDfvwb+FsMV+b2TbJe99EPf6Z+PGzqHEesP4I67gNmGG+e3pD94ZZn9WHcQ8SbzrFd1CIm4NAT19xvtYbxXqdZMEHPolv33b207rv7ad33D3Ig30/rkTHjPPeHUd+rO2IfcI5eIf76w5o7T3hxqcHdA9bCGc90q04N52oHLnDuNdaOtWx33X/1alG07a69sYR/G87rHZ+Bs9Zy9+G3dxPjGwv295q+7tdGLMOw4BTsPR5YW3ZBq+jWG2tZgy8OboBftJkd0+j53UazNx/mlXeDTtHz/Wu0mp2/sXv/qz/SvPj6bnqvmdX+bt03uB4nYOJeGGn0bwY+ueIjPjAsZuQGvahR9kNu9vz3+MGHeXZs9RP6WAdct/rQ7bTm0O9pdY41h+4wVjN7j4w96tuW23CMsjSiZqvV3lStuXORvRc+hvuoXiMHvd9o77a6VaP6H3arajoWfOd07x68nTxWHbyVVh1AjXyrzpCtn4+PuFqXfMDnysLfYWZwfsc0ndfeC9qcO8/r1hf0qx7u+Zy3g5f6ZuE0cz/1jdQsevLoflB373x5MyHe/iKHZc1uhbrOiRsyjzFsNmzf4ko/T9+8HLDAHLMc2GHW+nNe0QCmvcOQBvUaX8T7PWgS12po1q3YdyOt3D+dVuy/mWo9zXrFPuTpTFJWZMy+mxmHqDjNpOMavl9JPnjTVusWdKEjDdxGLX4NeZKW7vJe2bf4IVzemeZ93ur5kga1g270Xd5ne34H8+O7bnkGLt97PYfysolc59myWE9cK5n1xA1G3StL45plYKouMrgwpp1uLLcZNKhDjuuahu1W7NUHV487xsk3qVXuhjdNOMd8gsO7mOFdFedvKF6Kj0aberrv36JbuudaWrrnalLOsRu199ctbFdmwCEDpx7HWE/4znUtMAMGJsmxGzbDnvN8f8nuwM112yMDuwReoVu8BH97Is/mxIVsdwvGPPbv+R7Y/E733HyPbvH4FRKX7L6SVOewzH4c+SqDOw/O273lMFd9zbSxF48c0xKu8ljzg7oX13asPpJr1Vt6R/HmPNOq2PrW6EvfQW9wT/UNwV/x7Jr5Q76160qaFwPlxe08x6LB5by/HPoWc7nMmJv9otfoAsf5IGhGrmuVmXtocuD4Hegtsn3Pb6j786t118NIw31GLx2WPJTzyOAS8yLmS2lkDHU/5s/ERR4ZE0+zOnftPhdznznWdIqG7+JeuxHju07EYee68tT3EvWAGzF/cQ8e5qrdl3FKNi8Z2/GBg6m0kMQpCZjIwp2X8hyEKfVjwmHux0fGnAO87YkHN2CJ8Xl8AGrp64buChfu9e7i5hQfI9+6LQ/GM436PucFPObM7sPuFK96s7/F3ygvuiHd/EfSKGLHlIK9DizwDxOIC4iZYmZNTMBh5zzu/YMYPnwcf3DvFntpSV86hRt9gFc8V4+9G67feOl5w0cv/sUpb3PNcj/cCRpdPfYm/ku8+ZD/U/wLUOGYyjDRrH4AAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource cellListSelectedBackground;
  private static com.candorgrc.idfusion.sandbox.client.datapresentation.style.CellListStyle cellListStyle;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      cellListSelectedBackground(), 
      cellListStyle(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("cellListSelectedBackground", cellListSelectedBackground());
        resourceMap.put("cellListStyle", cellListStyle());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'cellListSelectedBackground': return this.@com.google.gwt.user.cellview.client.CellList.Resources::cellListSelectedBackground()();
      case 'cellListStyle': return this.@com.candorgrc.idfusion.sandbox.client.datapresentation.style.CellListResources::cellListStyle()();
    }
    return null;
  }-*/;
}
