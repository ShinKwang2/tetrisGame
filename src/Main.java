import game.block.BlockType;
import view.TetrisFrame;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TetrisFrame tetris = new TetrisFrame("테트리스");
        tetris.setSize(1200, 860);
        tetris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tetris.getContentPane().setBackground(new Color(230, 220, 200));
        tetris.setVisible(true);

    }
}