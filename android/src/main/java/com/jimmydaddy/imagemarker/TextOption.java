package com.jimmydaddy.imagemarker;

import com.facebook.react.bridge.ReadableMap;

public class TextOption {

    public String mark;
    public Integer X;
    public Integer Y;
    public String color;
    public String fontName;
    public Integer fontSize;
    ShadowLayerStyle shadowStyle;
    TextBackgroundStyle textBackgroundStyle;

    public TextOption(String mark, int x, int y, String color, String fontName, int fontSize, ShadowLayerStyle shadowStyle, TextBackgroundStyle textBackgroundStyle) {
        this.mark = mark;
        this.X = x;
        this.Y = y;
        this.color = color;
        this.fontName = fontName;
        this.fontSize = fontSize;
        this.shadowStyle = shadowStyle;
        this.textBackgroundStyle = textBackgroundStyle;
    }

    public TextOption(ReadableMap readableMap) {
        if (readableMap != null) {
            this.mark = readableMap.getString("text");
            this.X = readableMap.getInt("x");
            this.Y = readableMap.getInt("y");
            this.color = readableMap.getString("color");
            this.fontName = readableMap.getString("fontName");
            this.fontSize = readableMap.getInt("fontSize");
            ReadableMap shadowStyle = readableMap.getMap("shadowStyle");
            ReadableMap textBackgroundStyle = readableMap.getMap("textBackgroundStyle");
            this.shadowStyle= null != shadowStyle? new ShadowLayerStyle(shadowStyle) : null;
            this.textBackgroundStyle = null != textBackgroundStyle ? new TextBackgroundStyle(textBackgroundStyle) : null;
        }
    }
}
