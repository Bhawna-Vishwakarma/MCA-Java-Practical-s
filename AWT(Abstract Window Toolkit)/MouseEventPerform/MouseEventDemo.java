import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {
    private Label lblStatus;

    public MouseEventDemo() {
        setLayout(new FlowLayout());
        lblStatus = new Label();
        lblStatus.setPreferredSize(new Dimension(300, 20));
        add(lblStatus);

        // Add mouse listeners
        addMouseListener(this);
        addMouseMotionListener(this);

        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setVisible(true);
		setBackground(Color.magenta);

        // Window listener to close the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
	public void paint(Graphics g) 
	{ 
		Font f=new Font("arial",Font.BOLD,30);
		g.setFont(f); 
		this.setForeground(Color.white);

	}
    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        lblStatus.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        lblStatus.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        lblStatus.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        lblStatus.setText("Mouse Entered at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        lblStatus.setText("Mouse Exited at (" + e.getX() + ", " + e.getY() + ")");
    }

    // MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {
        lblStatus.setText("Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        lblStatus.setText("Mouse Moved at (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
