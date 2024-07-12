package module3assignment.gridder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Gridder extends JFrame {
    private final int gridCount = 10; // Define the size of the grid
    private final int[][] grid = new int[gridCount][gridCount];
    private final JTextField textInfo = new JTextField();
    private final JButton buttonRandomWhite = new JButton("Random White");
    private final JButton buttonRandomColumnWhite = new JButton("Random Column White");
    private final JButton buttonTopWhiteBottomBlack = new JButton("Top White Bottom Black");
    private final JButton buttonCountWhiteSquares = new JButton("Count White Squares");
    private final JButton buttonWhiteX = new JButton("White X");
    private final JButton buttonInverseGrid = new JButton("Inverse Grid");

    public Gridder() {
        initUI();
    }

    private void initUI() {
        setTitle("Gridder");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel);

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(gridCount, gridCount));
        panel.add(gridPanel, BorderLayout.CENTER);

        for (int i = 0; i < gridCount; i++) {
            for (int j = 0; j < gridCount; j++) {
                JButton button = new JButton();
                button.setBackground(Color.GRAY);
                int finalI = i;
                int finalJ = j;
                button.addActionListener(e -> {
                    grid[finalI][finalJ] = grid[finalI][finalJ] == 0 ? 1 : 0;
                    button.setBackground(grid[finalI][finalJ] == 1 ? Color.WHITE : Color.GRAY);
                });
                gridPanel.add(button);
            }
        }

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(6, 1));
        controlPanel.add(buttonRandomWhite);
        controlPanel.add(buttonRandomColumnWhite);
        controlPanel.add(buttonTopWhiteBottomBlack);
        controlPanel.add(buttonCountWhiteSquares);
        controlPanel.add(buttonWhiteX);
        controlPanel.add(buttonInverseGrid);
        panel.add(controlPanel, BorderLayout.EAST);

        buttonRandomWhite.addActionListener(e -> randomWhite());
        buttonRandomColumnWhite.addActionListener(e -> randomColumnWhite());
        buttonTopWhiteBottomBlack.addActionListener(e -> topWhiteBottomBlack());
        buttonCountWhiteSquares.addActionListener(e -> countWhiteSquares());
        buttonWhiteX.addActionListener(e -> whiteX());
        buttonInverseGrid.addActionListener(e -> inverseGrid());
    }

    private void randomWhite() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int row = random.nextInt(gridCount);
            int col = random.nextInt(gridCount);
            grid[col][row] = 1;
        }
        draw();
    }

    private void randomColumnWhite() {
        Random random = new Random();
        int col = random.nextInt(gridCount);
        for (int row = 0; row < gridCount; row++) {
            grid[col][row] = 1;
        }
        draw();
    }

    private void topWhiteBottomBlack() {
        clearGrid();
        for (int col = 0; col < gridCount; col++) {
            for (int row = 0; row < gridCount / 2; row++) {
                grid[col][row] = 1;
            }
        }
        draw();
    }

    private void countWhiteSquares() {
        int count = 0;
        for (int col = 0; col < gridCount; col++) {
            for (int row = 0; row < gridCount; row++) {
                if (grid[col][row] == 1) {
                    count++;
                }
            }
        }
        textInfo.setText(Integer.toString(count));
    }

    private void whiteX() {
        clearGrid();
        for (int i = 0; i < gridCount; i++) {
            grid[i][i] = 1;
            grid[i][gridCount - 1 - i] = 1;
        }
        draw();
    }

    private void inverseGrid() {
        for (int col = 0; col < gridCount; col++) {
            for (int row = 0; row < gridCount; row++) {
                grid[col][row] = grid[col][row] == 0 ? 1 : 0;
            }
        }
        draw();
    }

    private void draw() {
        getContentPane().removeAll();
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel);

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(gridCount, gridCount));
        panel.add(gridPanel, BorderLayout.CENTER);

        for (int i = 0; i < gridCount; i++) {
            for (int j = 0; j < gridCount; j++) {
                JButton button = new JButton();
                button.setBackground(grid[i][j] == 1 ? Color.WHITE : Color.GRAY);
                int finalI = i;
                int finalJ = j;
                button.addActionListener(e -> {
                    grid[finalI][finalJ] = grid[finalI][finalJ] == 0 ? 1 : 0;
                    button.setBackground(grid[finalI][finalJ] == 1 ? Color.WHITE : Color.GRAY);
                });
                gridPanel.add(button);
            }
        }

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(6, 1));
        controlPanel.add(buttonRandomWhite);
        controlPanel.add(buttonRandomColumnWhite);
        controlPanel.add(buttonTopWhiteBottomBlack);
        controlPanel.add(buttonCountWhiteSquares);
        controlPanel.add(buttonWhiteX);
        controlPanel.add(buttonInverseGrid);
        panel.add(controlPanel, BorderLayout.EAST);

        revalidate();
        repaint();
    }

    private void clearGrid() {
        for (int col = 0; col < gridCount; col++) {
            for (int row = 0; row < gridCount; row++) {
                grid[col][row] = 0;
            }
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            Gridder gridder = new Gridder();
            gridder.setVisible(true);
        });
    }
}
