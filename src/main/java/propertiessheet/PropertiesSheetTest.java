package propertiessheet;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.controlsfx.control.PropertySheet;
import org.controlsfx.property.BeanPropertyUtils;
import org.controlsfx.property.editor.DefaultPropertyEditorFactory;
import org.controlsfx.property.editor.Editors;
import org.controlsfx.property.editor.PropertyEditor;

import java.util.ArrayList;
import java.util.List;

public class PropertiesSheetTest extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Person bean = new Person();
        ObservableList<PropertySheet.Item> properties = BeanPropertyUtils.getProperties(bean);
        PropertySheet propertySheet = new PropertySheet(properties);
        propertySheet.setSearchBoxVisible(false);
        propertySheet.setModeSwitcherVisible(false);
        DefaultPropertyEditorFactory defaultPropertyEditorFactory = new DefaultPropertyEditorFactory();
        propertySheet.setPropertyEditorFactory(new Callback<PropertySheet.Item, PropertyEditor<?>>() {
            @Override
            public PropertyEditor<?> call(PropertySheet.Item param) {
                if(param.getName().equals("age")){
//                    List<Integer> ageList = new ArrayList<>();
//                    ageList.add(3);
//                    ageList.add(5);
//                    ageList.add(10);
//                    return Editors.createChoiceEditor(param,ageList);
                    return Editors.createNumericEditor(param);
                }
                return defaultPropertyEditorFactory.call(param);
            }
        });
        VBox vBox = new VBox(propertySheet);
        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
