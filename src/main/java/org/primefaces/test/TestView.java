package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;
import org.primefaces.event.SelectEvent;

@Data
@Named
@ManagedBean(name = "testView")
public class TestView implements Serializable {

    public String string;
    public Integer integer;
    public BigDecimal decimal;
    public LocalDateTime localDateTime;
    public List<TestObject> list;
    public List<String> listcaaaa = new ArrayList<>();
    public List<TestObject> selectedCustomers;
    public List<Long> selectedIds = new ArrayList<>();
    private boolean allSelected ;
    private boolean selected = false;

    public List<Long> getSelectedIds() {
        return selectedIds;
    }
    public boolean isAllSelected() {
        return allSelected;
    }

    public List<String> getListcaaaa() {
        return listcaaaa;
    }

    public void setListcaaaa(List<String> listcaaaa) {
        this.listcaaaa = listcaaaa;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public void setAllSelected(boolean allSelected) {
        this.allSelected = allSelected;
    }

    public void setSelectedIds(List<Long> selectedIds) {
        this.selectedIds = selectedIds;
    }
    public void onCheckboxSelect(AjaxBehaviorEvent event) {
        System.out.println("Checkbox selected: " + selectedIds);
    }

    // Method to handle checkbox unselection
    public void onCheckboxUnselect(AjaxBehaviorEvent event) {
        System.out.println("Checkbox unselected: " + selectedIds);
    }


    @PostConstruct  
    public void init() {
        list = new ArrayList<>(Arrays.asList(
                new TestObject("Thriller", "Michael Jackson", 1982),
                new TestObject("Back in Black", "AC/DC", 1980),
                new TestObject("The Bodyguard", "Whitney Houston", 1992),
                new TestObject("Thriller", "Michael Jackson", 1982),
                new TestObject("Back in Black", "AC/DC", 1980),
                new TestObject("The Bodyguard", "Whitney Houston", 1992),
                new TestObject("Thriller", "Michael Jackson", 1982),
                new TestObject("Back in Black", "AC/DC", 1980),
                new TestObject("The Bodyguard", "Whitney Houston", 1992),
                new TestObject("Thriller", "Michael Jackson", 1982),
                new TestObject("Back in Black", "AC/DC", 1980),
                new TestObject("The Bodyguard", "Whitney Houston", 1992),
                new TestObject("Thriller", "Michael Jackson", 1982),
                new TestObject("Back in Black", "AC/DC", 1980),
                new TestObject("The Bodyguard", "Whitney Houston", 1992),
                new TestObject("The Dark Side of the Moon", "Pink Floyd", 1973)

        ));
        System.out.println("22200000000000000000000000000");

    }

    public List<TestObject> getSelectedCustomers() {
        return selectedCustomers;
    }

    public void setSelectedCustomers(List<TestObject> selectedCustomers) {
        this.selectedCustomers = selectedCustomers;
    }

    public void onSelectionChange(SelectEvent event) {
        System.out.println("Selected IDs changed: " + selectedIds);
    }
    public void deleteCustomer(){
        if (listcaaaa != null && !listcaaaa.isEmpty()) {
            for (String id : listcaaaa) {
                System.out.println("Deleting customer with ID: " + id);
            }
            selectedIds.clear();
        } else {
            System.out.println("No customers selected.");
        }
    }
    public void selectAll(boolean value) {
        System.out.println("Toggle selection all: " + value);
        selected = allSelected;
    }

    public void selectedOptions2Changed() {
        String message = "selectedOptions2 changed to: ";

    }

    public void addMessage (){
        selected=true;
    }
    public void selectOnly(String value) {
        System.out.println("Toggle selection only : " + value);
        listcaaaa.add(value);
    }
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public List<TestObject> getList() {
        return list;
    }

    public void setList(List<TestObject> list) {
        this.list = list;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }
}
