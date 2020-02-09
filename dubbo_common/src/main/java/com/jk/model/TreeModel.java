package com.jk.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;

    private Integer pid;

    private String text;

    private String url;

    private String checked;

    private Map<String, Object> attributes = new HashMap<String, Object>(); // 添加到节点的自定义属性

    private List<TreeModel> nodes; //子节点数据

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public List<TreeModel> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeModel> nodes) {
        this.nodes = nodes;
    }

    private String gkl;

}