package javaHomeWork;
import javax.swing.*;
import java.awt.*;
public class HomeWork_1 extends JFrame {
	
	void myInfo() {
	setLayout(new GridLayout(8, 2));
    Container con = getContentPane();
    con.add(new JButton("�̸�"));
    con.add(new JTextField("���α�"));
    con.add(new JButton("�й�"));
    con.add(new JTextField("16112239"));
    con.add(new JButton("�а�"));
    con.add(new JTextField("������Ű��а�"));
    con.add(new JButton("�巡���"));
    con.add(new JTextField("SI������"));
    con.add(new JButton("�������� ��ȹ"));
    con.add(new JTextField("����б� ��â��� Java�� Github�� Ȱ���ؼ� ������Ʈ ����(���� �Ⱓ���� ������Ⱑ ��ǥ)"));
    con.add(new JButton("�����б� ��ȹ"));
    con.add(new JTextField("1�г⶧ ���� ��������� ������ϱ�"));
    con.add(new JButton("�¿��"));
    con.add(new JTextField("���� ���ٸ� ��ſ� ô�̶� �ض�"));
    con.add(new JButton("�� �λ��� ����"));
    con.add(new JTextField("���� ����"));
    setSize(1200, 400);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	
	public static void main(String[] args) {
		HomeWork_1 h = new HomeWork_1();
		h.myInfo();
	}
}
