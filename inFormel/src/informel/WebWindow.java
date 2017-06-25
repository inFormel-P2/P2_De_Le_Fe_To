package informel;


import java.net.URI;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javax.swing.JFrame;

/**
 *
 * @author root
 */
public class WebWindow extends JFrame {
  
  public WebWindow(URI resource) {
    JFXPanel jfxPanel = new JFXPanel(); // Scrollable JComopnent
    /*Platform.runLater( () -> { // FX components need to be managed by JavaFX
      WebView webView = new WebView();
      // webView.getEngine().loadContent( "<html> Hello World!" );
      webView.getEngine().load( resource.toString());
      jfxPanel.setScene( new Scene( webView ) );
    });
    getContentPane().add(jfxPanel);*/
  }
}
