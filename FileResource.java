package ua.model;

import ua.model.enums.EBookFormat;
import ua.model.enums.EBookType;

public record FileResource(String url, EBookFormat format, double size, EBookType type) { }
