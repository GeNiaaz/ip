//package duke;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.ScrollPane;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.Region;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//import javafx.scene.control.Label;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//
//public class Graphics extends Application {
//
//    private ScrollPane scrollPane;
//    private VBox dialogContainer;
//    private TextField userInput;
//    private Button sendButton;
//    private Scene scene;
//
//    // images of users
//    private Image user = new Image(this.getClass().getResourceAsStream("/images/user.png"));
//    private Image duke = new Image(this.getClass().getResourceAsStream("/images/assistant.png"));
//
//    @Override
//    public void start(Stage stage) {
//        //The container for the content of the chat to scroll.
//
//        // step 1
//        scrollPane = new ScrollPane();
//        dialogContainer = new VBox();
//        scrollPane.setContent(dialogContainer);
//
//        userInput = new TextField();
//        sendButton = new Button("Send");
//
//        AnchorPane mainLayout = new AnchorPane();
//        mainLayout.getChildren().addAll(scrollPane, userInput, sendButton);
//
//        scene = new Scene(mainLayout);
//
//        stage.setScene(scene);
//        stage.show();
//
//        //Step 2. Formatting the window to look as expected
//        stage.setTitle("GeNiaaz life assistant");
//        stage.setResizable(false);
//        stage.setMinHeight(700.0);
//        stage.setMinWidth(500.0);
//
//        mainLayout.setPrefSize(500.0, 700.0);
//
//        scrollPane.setPrefSize(470, 605);
//        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
//        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
//
//        scrollPane.setVvalue(1.0);
//        scrollPane.setFitToWidth(true);
//
//        dialogContainer.setPrefHeight(Region.USE_COMPUTED_SIZE);
//
//        userInput.setPrefWidth(325.0);
//
//        sendButton.setPrefWidth(55.0);
//
//        AnchorPane.setTopAnchor(scrollPane, 1.0);
//
//        AnchorPane.setBottomAnchor(sendButton, 1.0);
//        AnchorPane.setRightAnchor(sendButton, 1.0);
//
//        AnchorPane.setLeftAnchor(userInput , 1.0);
//        AnchorPane.setBottomAnchor(userInput, 1.0);
//
//        //Step 3. Add functionality to handle user input.
//        sendButton.setOnMouseClicked((event) -> {
////            dialogContainer.getChildren().add(getDialogLabel(userInput.getText()));
////            userInput.clear();
//            handleUserInput();
//        });
//
//        userInput.setOnAction((event) -> {
////            dialogContainer.getChildren().add(getDialogLabel(userInput.getText()));
////            userInput.clear();
//            handleUserInput();
//        });
//
//        //Scroll down to the end every time dialogContainer's height changes.
//        dialogContainer.heightProperty().addListener((observable) -> scrollPane.setVvalue(1.0));
//    }
//
//    /**
//     * Iteration 1:
//     * Creates a label with the specified text and adds it to the dialog container.
//     * @param text String containing text to add
//     * @return a label with the specified text that has word wrap enabled.
//     */
//    private Label getDialogLabel(String text) {
//        // You will need to import `javafx.scene.control.Label`.
//        Label textToAdd = new Label(text);
//        textToAdd.setWrapText(true);
//
//        return textToAdd;
//    }
//
//    /**
//     * Iteration 2:
//     * Creates two dialog boxes, one echoing user input and the other containing Duke's reply and then appends them to
//     * the dialog container. Clears the user input after processing.
//     */
//    private void handleUserInput() {
//        Label userText = new Label(userInput.getText());
//        Label dukeText = new Label(getResponse(userInput.getText()));
//        dialogContainer.getChildren().addAll(
//                DialogBox.getUserDialog(userText, new ImageView(user)),
//                DialogBox.getDukeDialog(dukeText, new ImageView(duke))
//        );
//        userInput.clear();
//    }
//
//    /**
//     * You should have your own function to generate a response to user input.
//     * Replace this stub with your completed method.
//     */
//    private String getResponse(String input) {
//        return "Duke heard: " + input;
//    }
//
//}
//
