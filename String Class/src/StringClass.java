public class StringClass {
    private char[] value;
    private int length;

    public StringClass(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null");
        }
        this.value = str.toCharArray();
        this.length = value.length;
    }

    public int length() {
        return length;
    }

    public char charAt(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
        }
        return value[index];
    }

    public StringClass substring(int beginIndex, int endIndex) {
        if (beginIndex < 0 || endIndex > length || beginIndex > endIndex) {
            throw new IndexOutOfBoundsException("Invalid substring range");
        }
        char[] subArray = new char[endIndex - beginIndex];
        System.arraycopy(value, beginIndex, subArray, 0, endIndex - beginIndex);
        return new StringClass(new String(subArray));
    }

    @Override
    public String toString() {
        return new String(value);
    }
}