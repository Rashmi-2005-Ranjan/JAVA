public class StringBuffer {
    private char[] buffer;
    private int length;

    public StringBuffer() {
        this.buffer = new char[16];
        this.length = 0;
    }

    public StringBuffer append(String str) {
        if (str == null) {
            return this;
        }
        int strLength = str.length();
        ensureCapacity(length + strLength);
        for (int i = 0; i < strLength; i++) {
            buffer[length++] = str.charAt(i);
        }
        return this;
    }

    public String toString() {
        return new String(buffer, 0, length);
    }

    private void ensureCapacity(int capacity) {
        if (capacity > buffer.length) {
            char[] newBuffer = new char[Math.max(capacity, buffer.length * 2)];
            System.arraycopy(buffer, 0, newBuffer, 0, length);
            buffer = newBuffer;
        }
    }
}
