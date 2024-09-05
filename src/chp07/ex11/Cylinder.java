package chp07.ex11;

public class Cylinder { // 원기둥

  int radius; //반지름

  int height;

   // 원기둥의 부피
  double getvolume(){
      return Math.PI * Math.pow(radius,2) * height;
  }


   // 원기둥의 겉넓이
  double getSurfaceArea(){
      double circleArea = Math.PI * Math.pow(radius,2);
      double rectgleArea = 2 * Math.PI * radius * height;

      return 2 * circleArea + rectgleArea;
  }
}
