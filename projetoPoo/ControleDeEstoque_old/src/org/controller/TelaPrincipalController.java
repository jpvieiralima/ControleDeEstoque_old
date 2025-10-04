package org.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.model.Produto;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TelaPrincipalController implements Initializable {

    @FXML
    private TableView<Produto> tableViewProdutos;

    @FXML
    private TableColumn<Produto, String> tableColumnNome;

    @FXML
    private TableColumn<Produto, Double> tableColumnPreco;

    @FXML
    private TableColumn<Produto, Integer> tableColumnQuantidade;

    @FXML
    private Label labelValorTotal;

    private List<Produto> listProdutos = new ArrayList<>();
    private ObservableList<Produto> observableListProdutos;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tableColumnPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));
        tableColumnQuantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));

        carregarProdutos();
        calcularValorTotalEstoque();
    }

    public void carregarProdutos() {
        Produto produto1 = new Produto("Mouse", 50.0, 10);
        Produto produto2 = new Produto("Teclado", 150.0, 15);
        Produto produto3 = new Produto("Monitor", 800.0, 5);
        Produto produto4 = new Produto("Impressora", 1200.0, 3);

        listProdutos.add(produto1);
        listProdutos.add(produto2);
        listProdutos.add(produto3);
        listProdutos.add(produto4);

        observableListProdutos = FXCollections.observableArrayList(listProdutos);
        tableViewProdutos.setItems(observableListProdutos);
    }

    public void calcularValorTotalEstoque() {
        double valorTotal = 0.0;
        for (Produto produto : listProdutos) {
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
        labelValorTotal.setText(String.format("Valor Total do Estoque: R$ %.2f", valorTotal));
    }
}

