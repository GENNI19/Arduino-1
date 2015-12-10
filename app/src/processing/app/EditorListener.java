package processing.app;

import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import processing.app.syntax.SketchTextArea;

public class EditorListener implements KeyListener {
  
  private Editor editor;
  
  public EditorListener(Editor editor) {
    super();
    this.editor = editor;
  }
  
  /** ctrl-alt on windows and linux, cmd-alt on mac os x */
  private static final int CTRL = Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();
  private static final int CTRL_ALT = InputEvent.ALT_MASK | CTRL;
  private static final int CTRL_SHIFT = InputEvent.SHIFT_MASK | CTRL;

  public void keyTyped(KeyEvent event) {
    char c = event.getKeyChar();

    if ((event.getModifiers() & KeyEvent.CTRL_MASK) != 0) {
      // The char is not control code when CTRL key pressed? It should be a shortcut.
      if (!Character.isISOControl(c)) {
        event.consume();
      }
    }
  }

  @Override
  public void keyPressed(KeyEvent event) {
  }

  @Override
  public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub
    
  }

}
