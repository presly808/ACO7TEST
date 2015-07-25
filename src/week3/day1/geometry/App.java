package week3.day1.geometry;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
//    Rectangular rect = new Rectangular(2, 3);
////    System.out.println(rect.square());
//    FigureHelper.printSquare(rect);
//
//    Circle circle = new Circle(1);
//    FigureHelper.printSquare(circle);
//
//    Kvadrat kv = new Kvadrat(2);
//    FigureHelper.printSquare(kv);

    Figure f = new Kvadrat(1);
//    Figure f2 = new Figure();


    Scanner sc = new Scanner(System.in);

    printFigureList();
    int figureType = sc.nextInt();
    Figure figure = createFigure(figureType);
    FigureHelper.printSquare(figure);

  }

  public static Figure createFigure(int type) {
    Figure figure = null;
    switch (type) {
      case 1:
        figure = new Circle(2);
        break;
      case 2:
        figure = new Kvadrat(3);
        break;
      case 3:
        figure = new Rectangular(2, 3);
        break;
      case 4:
        figure = new Triangle(2, 3);
        break;
    }
    return figure;
  }

  public static void printFigureList() {
    System.out.println("Choose figure");
    int index = 0;
    System.out.println(++index + ". Circle");
    System.out.println(++index + ". Kvadrat");
    System.out.println(++index + ". Rectangular");
    System.out.println(++index + ". Triangle");
  }


}
