package nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class WatchServiceExample extends Application{

	TextArea textArea;
	
	class WatchServiceThread extends Thread{
		@Override
		public void run() {
			try {
				WatchService service = FileSystems.getDefault().newWatchService();
				Path directory = Paths.get("C:/Temp");
				directory.register(service, StandardWatchEventKinds.ENTRY_CREATE,
						StandardWatchEventKinds.ENTRY_DELETE,
						StandardWatchEventKinds.ENTRY_MODIFY);
				
				while (true) {
					
					WatchKey key = service.take(); // WatchKey�� ť�� ���ö����� ���ŷ
					List<WatchEvent<?>> list = key.pollEvents(); // WatchEvent ��� ���
					
					for (WatchEvent watchEvent : list) {
						
						// �̺�Ʈ ���� ���
						Kind kind = watchEvent.kind();
						
						Path path = (Path) watchEvent.context();
						if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
							// �����Ǿ��� ��� ������ �ڵ�
							Platform.runLater(()-> textArea.appendText("���� ������ ->" + path.getFileName() + "\n"));
						} else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
							// �����Ǿ��� ��� ������ �ڵ�
							Platform.runLater(()-> textArea.appendText("���� ������ ->" + path.getFileName() + "\n"));
						} else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
							// �����Ǿ��� ��� ������ �ڵ�
							Platform.runLater(()-> textArea.appendText("���� ������ ->" + path.getFileName() + "\n"));
						} else if (kind == StandardWatchEventKinds.OVERFLOW) {
							
						}
					}
					boolean valid = key.reset();
					if (!valid) {break;}
				}
				
			} catch (Exception e) {}
		}
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		textArea = new TextArea();
		textArea.setEditable(false);
		root.setCenter(textArea);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("WatchServiceExample");
		primaryStage.show();
		
		WatchServiceThread wst = new WatchServiceThread();
		wst.start();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
