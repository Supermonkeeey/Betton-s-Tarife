package ch.betton.bettonstarif.controller;

import ch.betton.bettonstarif.primefaces.Theme;
import ch.betton.bettonstarif.primefaces.ThemeService;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import org.primefaces.event.ToggleEvent;

/**
 *
 * @author bettin
 */
@ManagedBean(name = "formControler", eager = true)
public class FormController {

    //Irelevant
    private Theme theme;
    private List<Theme> themes;

    @ManagedProperty("#{themeService}")
    private ThemeService service;

    @PostConstruct
    public void init() {
        themes = service.getThemes();
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setService(ThemeService service) {
        this.service = service;
    }

    public void handleToggle(ToggleEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Toggled", "Visibility:" + event.getVisibility());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

}
