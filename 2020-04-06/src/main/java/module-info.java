module br.edu.fapce._04_06._04_06 {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.fapce._04_06._04_06 to javafx.fxml;
    exports br.edu.fapce._04_06._04_06;
}