package week7.day1;

import java.util.ArrayList;
import java.util.List;

public class TreeRecursion {

  public static void main(String[] args) {
    Worker w1 = new Worker("dir", "rep1");

    Worker w2 = new Worker("man", "rep2");
    Worker w3 = new Worker("man", "rep2");
    Worker w4 = new Worker("man", "rep2");


    Worker w5 = new Worker("emp", "rep3");
    Worker w6 = new Worker("emp", "rep3");
    Worker w7 = new Worker("emp", "rep3");
    Worker w8 = new Worker("emp", "rep3");

    w2.addSlave(w7);
    w3.addSlave(w5);
    w3.addSlave(w6);
    w4.addSlave(w8);

    w1.addSlave(w2);
    w1.addSlave(w3);
    w1.addSlave(w4);

    String res = w1.makeReport();
    System.out.println(res);

  }


  /*public static String makeReport(Worker curr) {
    if (curr.slaves == null || curr.slaves.isEmpty()) {
      return curr.reportInfo;
    }

    List<Worker> workers = curr.slaves;

    String res = "";
    for (Worker worker : workers) {
      res += makeReport(worker) + ",";
    }

    res = curr.reportInfo + "," + res;

    return res;
  }*/
}


class Worker {

  String type;
  String reportInfo;
  List<Worker> slaves;

  Worker(String type, String reportInfo) {
    this.type = type;
    this.reportInfo = reportInfo;
    slaves = new ArrayList<Worker>();
  }

  public void addSlave(Worker worker) {
    slaves.add(worker);
  }

  public String makeReport() {
    if (slaves.isEmpty()) {
      return reportInfo;
    }

    StringBuilder builder = new StringBuilder();
    String separator = ",";
    for (Worker slave : slaves) {
      builder.append(slave.makeReport()).append(separator);
    }

    builder.append(reportInfo).append(separator);

    return builder.toString();
  }
}
