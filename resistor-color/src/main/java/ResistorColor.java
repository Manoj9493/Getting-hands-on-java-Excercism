class ResistorColor {
    int colorCode(String color) {
        String[] colorList = colors();
        for (int i = 0; i < colorList.length; i++) {
            if (color.equals(colorList[i])) {
                return i;
            }
        }
        throw new IllegalArgumentException("Color not in the list");
    }

    String[] colors() {
        return new String[] { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
    }

}
