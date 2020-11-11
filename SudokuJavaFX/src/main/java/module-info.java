module SudokuJavaFX {
	
	exports app;
	exports app.controller;
	
	requires SudokuBLL;
	
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.media;
	
	opens app.controller to javafx.fxml;
}