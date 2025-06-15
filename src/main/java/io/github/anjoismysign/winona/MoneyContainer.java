package io.github.anjoismysign.winona;

public interface MoneyContainer {
  double getBalance();
  
  void setBalance(double paramDouble);
  
  default boolean has(double amount) {
    return (getBalance() >= amount);
  }
  
  default void add(double amount) {
    setBalance(getBalance() + amount);
  }
  
  default void subtract(double amount) {
    setBalance(getBalance() - amount);
  }
  
  default void reset() {
    setBalance(0.0D);
  }
}
