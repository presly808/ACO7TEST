package week2.day2;

public final class IntNumber {
  private final int value;

  public IntNumber(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public IntNumber add(IntNumber number){
    return new IntNumber(value + number.value);
  }

  public String toString() {
    return String.valueOf(value);
  }

  public boolean equals(Object obj){
    if(this == obj) {
      return true;
    }

    if(obj == null) {
      return false;
    }

    if(!(obj instanceof IntNumber)) {
      return false;
    }

    IntNumber other = (IntNumber) obj;

    return value == other.value;
  }

}
