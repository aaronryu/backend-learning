package fc.java.model2;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY = 5; // 수정불가(final) -> 상수
    private int[] elements;
    private int size = 0;

    // 생성 동작
    public IntArray() {
        elements = new int[DEFAULT_CAPACITY];
    }

    // 저장 동작
    public void add(int element) {
        // 크기체크
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public void pop(){
        if (size > 0){
            elements[--size] = 0;
        } else {
            System.out.println("삭제할 요소가 없습니다.");
        }
    }

    // 가져오는 동작
    public int get(int index) {
        // 음수 및 범위를 초과 체크
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("범위초과"); // JVM이 잡아서 처리
        }
        return elements[index];
    }

    // 원소갯수 넘겨주는 동작
    public int size() {
        return size;
    }

    private void ensureCapacity(){
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}