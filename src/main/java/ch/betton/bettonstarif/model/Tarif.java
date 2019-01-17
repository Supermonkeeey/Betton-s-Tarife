package ch.betton.bettonstarif.model;

/**
 *
 * @author bettin
 */
public class Tarif {
//0 bis 4

    private String anbieter;
    private String name;
    private String art;
    private Double preisProMonat;
    private String datenSpeed;
//5 bis 9
    private String datenVolumen;
    private String datenKosten;
    private String datenRoamingkosten;
    private String datenRoamingInklusive;
    private String smsKosten;
//10 bis 14
    private String smsAnzahlInkusive;
    private String mmsKosten;
    private String mmsAnzahlInkusive;
    private String anrufeKosten;
    private String anrufeAnzahlInklusive;
//15 bis 19
    private String anrufeKostenAuslandEmpfangen;
    private String anrufeKostenAuslandOrtsgespraeche;
    private String anrufeKostenAuslandInSchweiz;
    private String anrufeKostenAuslandAusSchweiz;
    private String anrufeAnzahlInklusiveAuslandAusSchweiz;
//20 bis 24
    private String smsKostenAuslandSundE;
    private String smsAnzahlInklusiveAuslandSundE;
    private String mmsKostenAuslandSundE;
    private String mmsAnzahlInklusiveAuslandSundE;
    private Integer alterBeschrenkung;
//25 bis 29
    private String boni;
    private Integer mindestlaufzeit;
    private String aktivierungsbedingungen;
    private Double aktivierungskosten;
    private Integer datenInlandIndex;
//30 bis 34
    private Integer anrufInlandIndex;
    private Integer sMSMMSInlandIndex;
    private Integer datenAuslandIndex;
    private Integer anrufAuslandIndex;
    private Integer sMSMMSAuslandIndex;

    private Boolean kill;

    public Tarif(String anbieter, String name, String art, Double preisProMonat, String datenSpeed, String datenVolumen, String datenKosten, String datenRoamingkosten, String datenRoamingInklusive, String smsKosten, String smsAnzahlInkusive, String mmsKosten, String mmsAnzahlInkusive, String anrufeKosten, String anrufeAnzahlInklusive, String anrufeKostenAuslandEmpfangen, String anrufeKostenAuslandOrtsgespraeche, String anrufeKostenAuslandInSchweiz, String anrufeKostenAuslandAusSchweiz, String anrufeAnzahlInklusiveAuslandAusSchweiz, String smsKostenAuslandSundE, String smsAnzahlInklusiveAuslandSundE, String mmsKostenAuslandSundE, String mmsAnzahlInklusiveAuslandSundE, Integer alterBeschrenkung, String boni, Integer mindestlaufzeit, String aktivierungsbedingungen, Double aktivierungskosten, Integer datenInlandIndex, Integer anrufInlandIndex, Integer sMSMMSInlandIndex, Integer datenAuslandIndex, Integer anrufAuslandIndex, Integer sMSMMSAuslandIndex) {
        this.anbieter = anbieter;
        this.name = name;
        this.art = art;
        this.preisProMonat = preisProMonat;
        this.datenSpeed = datenSpeed;
        this.datenVolumen = datenVolumen;
        this.datenKosten = datenKosten;
        this.datenRoamingkosten = datenRoamingkosten;
        this.datenRoamingInklusive = datenRoamingInklusive;
        this.smsKosten = smsKosten;
        this.smsAnzahlInkusive = smsAnzahlInkusive;
        this.mmsKosten = mmsKosten;
        this.mmsAnzahlInkusive = mmsAnzahlInkusive;
        this.anrufeKosten = anrufeKosten;
        this.anrufeAnzahlInklusive = anrufeAnzahlInklusive;
        this.anrufeKostenAuslandEmpfangen = anrufeKostenAuslandEmpfangen;
        this.anrufeKostenAuslandOrtsgespraeche = anrufeKostenAuslandOrtsgespraeche;
        this.anrufeKostenAuslandInSchweiz = anrufeKostenAuslandInSchweiz;
        this.anrufeKostenAuslandAusSchweiz = anrufeKostenAuslandAusSchweiz;
        this.anrufeAnzahlInklusiveAuslandAusSchweiz = anrufeAnzahlInklusiveAuslandAusSchweiz;
        this.smsKostenAuslandSundE = smsKostenAuslandSundE;
        this.smsAnzahlInklusiveAuslandSundE = smsAnzahlInklusiveAuslandSundE;
        this.mmsKostenAuslandSundE = mmsKostenAuslandSundE;
        this.mmsAnzahlInklusiveAuslandSundE = mmsAnzahlInklusiveAuslandSundE;
        this.alterBeschrenkung = alterBeschrenkung;
        this.boni = boni;
        this.mindestlaufzeit = mindestlaufzeit;
        this.aktivierungsbedingungen = aktivierungsbedingungen;
        this.aktivierungskosten = aktivierungskosten;
        this.datenInlandIndex = datenInlandIndex;
        this.anrufInlandIndex = anrufInlandIndex;
        this.sMSMMSInlandIndex = sMSMMSInlandIndex;
        this.datenAuslandIndex = datenAuslandIndex;
        this.anrufAuslandIndex = anrufAuslandIndex;
        this.sMSMMSAuslandIndex = sMSMMSAuslandIndex;
        this.kill = false;
    }

    public Boolean getKill() {
        return kill;
    }

    public void setKill(Boolean kill) {
        this.kill = kill;
    }

    public Integer getDatenInlandIndex() {
        return datenInlandIndex;
    }

    public void setDatenInlandIndex(Integer datenInlandIndex) {
        this.datenInlandIndex = datenInlandIndex;
    }

    public Integer getAnrufInlandIndex() {
        return anrufInlandIndex;
    }

    public void setAnrufInlandIndex(Integer anrufInlandIndex) {
        this.anrufInlandIndex = anrufInlandIndex;
    }

    public Integer getsMSMMSInlandIndex() {
        return sMSMMSInlandIndex;
    }

    public void setsMSMMSInlandIndex(Integer sMSMMSInlandIndex) {
        this.sMSMMSInlandIndex = sMSMMSInlandIndex;
    }

    public Integer getDatenAuslandIndex() {
        return datenAuslandIndex;
    }

    public void setDatenAuslandIndex(Integer datenAuslandIndex) {
        this.datenAuslandIndex = datenAuslandIndex;
    }

    public Integer getAnrufAuslandIndex() {
        return anrufAuslandIndex;
    }

    public void setAnrufAuslandIndex(Integer anrufAuslandIndex) {
        this.anrufAuslandIndex = anrufAuslandIndex;
    }

    public Integer getsMSMMSAuslandIndex() {
        return sMSMMSAuslandIndex;
    }

    public void setsMSMMSAuslandIndex(Integer sMSMMSAuslandIndex) {
        this.sMSMMSAuslandIndex = sMSMMSAuslandIndex;
    }

    public Tarif(String string, String string0, String string1, Double preisProMonat, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22, Integer mindestlaufzeit, String string23, Double aktivierungskosten, String string24) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAnbieter() {
        return anbieter;
    }

    public void setAnbieter(String anbieter) {
        this.anbieter = anbieter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public Double getPreisProMonat() {
        return preisProMonat;
    }

    public void setPreisProMonat(Double preisProMonat) {
        this.preisProMonat = preisProMonat;
    }

    public String getDatenSpeed() {
        return datenSpeed;
    }

    public void setDatenSpeed(String datenSpeed) {
        this.datenSpeed = datenSpeed;
    }

    public String getDatenVolumen() {
        return datenVolumen;
    }

    public void setDatenvolumen(String datenVolumen) {
        this.datenVolumen = datenVolumen;
    }

    public String getDatenKosten() {
        return datenKosten;
    }

    public void setDatenKosten(String datenKosten) {
        this.datenKosten = datenKosten;
    }

    public String getDatenRoamingkosten() {
        return datenRoamingkosten;
    }

    public void setDatenRoamingkosten(String datenRoamingkosten) {
        this.datenRoamingkosten = datenRoamingkosten;
    }

    public String getDatenRoamingInklusive() {
        return datenRoamingInklusive;
    }

    public void setDatenRoamingInklusive(String datenRoamingInklusive) {
        this.datenRoamingInklusive = datenRoamingInklusive;
    }

    public String getSmsKosten() {
        return smsKosten;
    }

    public void setSmsKosten(String smsKosten) {
        this.smsKosten = smsKosten;
    }

    public String getSmsAnzahlInkusive() {
        return smsAnzahlInkusive;
    }

    public void setSmsAnzahlInkusive(String smsAnzahlInkusive) {
        this.smsAnzahlInkusive = smsAnzahlInkusive;
    }

    public String getMmsKosten() {
        return mmsKosten;
    }

    public void setMmsKosten(String mmsKosten) {
        this.mmsKosten = mmsKosten;
    }

    public String getMmsAnzahlInkusive() {
        return mmsAnzahlInkusive;
    }

    public void setMmsAnzahlInkusive(String mmsAnzahlInkusive) {
        this.mmsAnzahlInkusive = mmsAnzahlInkusive;
    }

    public String getAnrufeKosten() {
        return anrufeKosten;
    }

    public void setAnrufeKosten(String anrufeKosten) {
        this.anrufeKosten = anrufeKosten;
    }

    public String getAnrufeAnzahlInklusive() {
        return anrufeAnzahlInklusive;
    }

    public void setAnrufeAnzahlInklusive(String anrufeAnzahlInklusive) {
        this.anrufeAnzahlInklusive = anrufeAnzahlInklusive;
    }

    public String getAnrufeKostenAuslandEmpfangen() {
        return anrufeKostenAuslandEmpfangen;
    }

    public void setAnrufeKostenAuslandEmpfangen(String anrufeKostenAuslandEmpfangen) {
        this.anrufeKostenAuslandEmpfangen = anrufeKostenAuslandEmpfangen;
    }

    public String getAnrufeKostenAuslandOrtsgespraeche() {
        return anrufeKostenAuslandOrtsgespraeche;
    }

    public void setAnrufeKostenAuslandOrtsgespraeche(String anrufeKostenAuslandOrtsgespraeche) {
        this.anrufeKostenAuslandOrtsgespraeche = anrufeKostenAuslandOrtsgespraeche;
    }

    public String getAnrufeKostenAuslandInSchweiz() {
        return anrufeKostenAuslandInSchweiz;
    }

    public void setAnrufeKostenAuslandInSchweiz(String anrufeKostenAuslandInSchweiz) {
        this.anrufeKostenAuslandInSchweiz = anrufeKostenAuslandInSchweiz;
    }

    public String getAnrufeKostenAuslandAusSchweiz() {
        return anrufeKostenAuslandAusSchweiz;
    }

    public void setAnrufeKostenAuslandAusSchweiz(String anrufeKostenAuslandAusSchweiz) {
        this.anrufeKostenAuslandAusSchweiz = anrufeKostenAuslandAusSchweiz;
    }

    public String getAnrufeAnzahlInklusiveAuslandAusSchweiz() {
        return anrufeAnzahlInklusiveAuslandAusSchweiz;
    }

    public void setAnrufeAnzahlInklusiveAuslandAusSchweiz(String anrufeAnzahlInklusiveAuslandAusSchweiz) {
        this.anrufeAnzahlInklusiveAuslandAusSchweiz = anrufeAnzahlInklusiveAuslandAusSchweiz;
    }

    public String getSmsKostenAuslandSundE() {
        return smsKostenAuslandSundE;
    }

    public void setSmsKostenAuslandSundE(String smsKostenAuslandSundE) {
        this.smsKostenAuslandSundE = smsKostenAuslandSundE;
    }

    public String getSmsAnzahlInklusiveAuslandSundE() {
        return smsAnzahlInklusiveAuslandSundE;
    }

    public void setSmsAnzahlInklusiveAuslandSundE(String smsAnzahlInklusiveAuslandSundE) {
        this.smsAnzahlInklusiveAuslandSundE = smsAnzahlInklusiveAuslandSundE;
    }

    public String getMmsKostenAuslandSundE() {
        return mmsKostenAuslandSundE;
    }

    public void setMmsKostenAuslandSundE(String mmsKostenAuslandSundE) {
        this.mmsKostenAuslandSundE = mmsKostenAuslandSundE;
    }

    public String getMmsAnzahlInklusiveAuslandSundE() {
        return mmsAnzahlInklusiveAuslandSundE;
    }

    public void setMmsAnzahlInklusiveAuslandSundE(String mmsAnzahlInklusiveAuslandSundE) {
        this.mmsAnzahlInklusiveAuslandSundE = mmsAnzahlInklusiveAuslandSundE;
    }

    public Integer getAlterBeschrenkung() {
        return alterBeschrenkung;
    }

    public void setAlterBeschrenkung(Integer alterBeschrenkung) {
        this.alterBeschrenkung = alterBeschrenkung;
    }

    public String getBoni() {
        return boni;
    }

    public void setBoni(String boni) {
        this.boni = boni;
    }

    public Integer getMindestlaufzeit() {
        return mindestlaufzeit;
    }

    public void setMindestlaufzeit(Integer mindestlaufzeit) {
        this.mindestlaufzeit = mindestlaufzeit;
    }

    public String getAktivierungsbedingungen() {
        return aktivierungsbedingungen;
    }

    public void setAktivierungsbedingungen(String aktivierungsbedingungen) {
        this.aktivierungsbedingungen = aktivierungsbedingungen;
    }

    public Double getAktivierungskosten() {

        return aktivierungskosten;
    }

    public void setAktivierungskosten(Double aktivierungskosten) {
        this.aktivierungskosten = aktivierungskosten;
    }

    public Double getDurchschnittskostenProJahr() {

        return round(getDurchschnittskostenProMonat() * 12, 2);
    }

    public Double getDurchschnittskostenProMonat() {
        Double aks = this.aktivierungskosten;
        Double ppm = this.preisProMonat;
        Integer mlz = this.mindestlaufzeit;
        Double tmp;

        if (0 == ppm) {
            tmp = ppm;
        } else {
            tmp = ((mlz * ppm) + aks) / mlz;
        }
        return round(tmp, 2);
    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
