package ch.betton.bettonstarif.controller;

import ch.betton.bettonstarif.model.Tarif;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author bettin
 */
@ManagedBean(name = "tarifController", eager = true)
public class TarifController {

    //Alter
    @ManagedProperty("#{age}")
    private int age;

    //Dauer (Egal/12/24)
    @ManagedProperty("#{duration}")
    private int duration = 24;

    //Telefonieren Inland
    @ManagedProperty("#{opinion02}")
    private int opinion02 = 9;

    //SMS/MMS Inland 
    @ManagedProperty("#{opinion03}")
    private int opinion03 = 9;

    //Daten Inland 
    @ManagedProperty("#{opinion04}")
    private int opinion04 = 9;

    //Netzqualität
    @ManagedProperty("#{opinion05}")
    private int opinion05 = 9;

    //Telefonieren Ausland
    @ManagedProperty("#{opinion06}")
    private int opinion06 = 9;

    //SMS/MMS Ausland 
    @ManagedProperty("#{opinion07}")
    private int opinion07 = 9;

    //Daten Ausland
    @ManagedProperty("#{opinion08}")
    private int opinion08 = 9;

    String csvFile = "D:\\OneDrive\\Schule\\Jahr 3\\IDPA\\Handy Tarif\\Betton's Tarife\\src\\main\\java\\ch\\betton\\bettonstarif\\controller\\Tarife.CSV";
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";
    int hans = 421;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getOpinion02() {
        return opinion02;
    }

    public void setOpinion02(int opinion02) {
        this.opinion02 = opinion02;
    }

    public int getOpinion03() {
        return opinion03;
    }

    public void setOpinion03(int opinion03) {
        this.opinion03 = opinion03;
    }

    public int getOpinion04() {
        return opinion04;
    }

    public void setOpinion04(int opinion04) {
        this.opinion04 = opinion04;
    }

    public int getOpinion05() {
        return opinion05;
    }

    public void setOpinion05(int opinion05) {
        this.opinion05 = opinion05;
    }

    public int getOpinion06() {
        return opinion06;
    }

    public void setOpinion06(int opinion06) {
        this.opinion06 = opinion06;
    }

    public int getOpinion07() {
        return opinion07;
    }

    public void setOpinion07(int opinion07) {
        this.opinion07 = opinion07;
    }

    public int getOpinion08() {
        return opinion08;
    }

    public void setOpinion08(int opinion08) {
        this.opinion08 = opinion08;
    }

    public void keinAusland() {
        opinion06 = 0;
        opinion07 = 0;
        opinion08 = 0;
    }

    public int getHans() {
        return hans;
    }

    public void setHans(int hans) {
        this.hans = hans;
    }

    @ManagedProperty("#{first}")
    Tarif first;
    @ManagedProperty("#{second}")
    Tarif second;
    @ManagedProperty("#{third}")
    Tarif third;

    public Tarif getFirst() {
        return first;
    }

    public void setFirst(Tarif first) {
        this.first = first;
    }

    public Tarif getSecond() {
        return second;
    }

    public void setSecond(Tarif second) {
        this.second = second;
    }

    public Tarif getThird() {
        return third;
    }

    public void setThird(Tarif third) {
        this.third = third;
    }

    private ObservableList<Tarif> tarife = FXCollections.observableArrayList();

    //Füllt die tarife - ObservableList mit einträgen, dies sorgt für eine einfache Beartbarkeit der Tarife
    //durch die Aktualisierung der Tarife.CSV Datei
    public void fillList() {
        int count = 1;
        System.out.println("Liste wird gefüllt");
        try {

            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {

                String[] tarif = line.split(cvsSplitBy);

                String tmp01 = tarif[3];
                String tmp02 = tarif[24];
                String tmp03 = tarif[26];
                String tmp04 = tarif[28];
                String tmp05 = tarif[29];
                String tmp06 = tarif[30];
                String tmp07 = tarif[31];
                String tmp08 = tarif[32];
                String tmp09 = tarif[33];
                String tmp10 = tarif[34];
                System.out.println("------------------------------------");
                System.out.println(tmp01);
                System.out.println(tmp02);
                System.out.println(tmp03);
                System.out.println(tmp04);
                System.out.println(tmp05);
                System.out.println(tmp06);
                System.out.println(tmp07);
                System.out.println(tmp08);
                System.out.println(tmp09);
                System.out.println(tmp10);
                System.out.println("------------------------------------");

                Double preisProMonat = Double.parseDouble(tarif[3]);
                Integer alterBeschrenkung = Integer.parseInt(tarif[24]);
                Integer mindestlaufzeit = Integer.parseInt(tarif[26]);
                Double aktivierungskosten = Double.parseDouble(tarif[28]);

                Integer datenInlandIndex = Integer.parseInt(tarif[29]);
                Integer anrufInlandIndex = Integer.parseInt(tarif[30]);
                Integer sMSMMSInlandIndex = Integer.parseInt(tarif[31]);
                Integer DatenAuslandIndex = Integer.parseInt(tarif[32]);
                Integer anrufAuslandIndex = Integer.parseInt(tarif[33]);
                Integer sMSMMSAuslandIndex = Integer.parseInt(tarif[34]);

                tarife.add(new Tarif(
                        tarif[0], tarif[1], tarif[2], preisProMonat, tarif[4],
                        tarif[5], tarif[6], tarif[7], tarif[8], tarif[9],
                        tarif[10], tarif[11], tarif[12], tarif[13], tarif[14],
                        tarif[15], tarif[16], tarif[17], tarif[18], tarif[19],
                        tarif[20], tarif[21], tarif[22], tarif[23], alterBeschrenkung,
                        tarif[25], mindestlaufzeit, tarif[27], aktivierungskosten, datenInlandIndex,
                        anrufInlandIndex, sMSMMSInlandIndex, DatenAuslandIndex, anrufAuslandIndex, sMSMMSAuslandIndex));
                System.out.println("Tarif " + count + " erstellt");
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //Filtert alle nicht relevanten Tarife heraus
    public void findRelevant() {
        for (Tarif tarif : tarife) {

            if (tarif.getAnrufInlandIndex() < opinion02) {
                tarife.remove(tarif);
                System.out.println("------------------------------------");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }
            if (tarif.getDatenInlandIndex() < opinion04) {
                tarife.remove(tarif);
                System.out.println("------------------------------------");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }
            if (tarif.getsMSMMSInlandIndex() < opinion03) {
                tarife.remove(tarif);
                System.out.println("------------------------------------");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }
            if (tarif.getAnbieter() == "Salt") {
                if (opinion05 == 1) {
                    tarife.remove(tarif);
                    System.out.println("------------------------------------");
                    System.out.println(tarif.getName());
                    System.out.println("------------------------------------");
                }
                tarife.remove(tarif);
                System.out.println("------------------------------------");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }
            if (tarif.getAlterBeschrenkung() > age) {
                tarife.remove(tarif);
                System.out.println("------------------------------------");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");

            }
            if (tarif.getMindestlaufzeit() == 0) {

            } else if (tarif.getMindestlaufzeit() != duration) {
                tarife.remove(tarif);
                System.out.println("------------------------------------");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }
            if (tarif.getAnrufAuslandIndex() < opinion06) {
                tarife.remove(tarif);
                System.out.println("------------------------------------");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }
            if (tarif.getsMSMMSAuslandIndex() < opinion07) {
                tarife.remove(tarif);
                System.out.println("------------------------------------");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }
            if (tarif.getDatenAuslandIndex() < opinion08) {
                tarife.remove(tarif);
                System.out.println("------------------------------------");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }
        }
        findTopThree();
    }

    //Filter die drei günstigsten Tarife heraus
    public void findTopThree() {
        System.out.println("Top dreis Ausgeführt");
        for (Tarif tarif : tarife) {

            System.out.println("Trifname: ");
            System.out.print(tarif.getName());
            Double one = 10000.0;
            Double two = 10000.0;
            Double three = 10000.0;

            if (tarif.getPreisProMonat() <= one) {
                one = tarif.getPreisProMonat();
                first = tarif;
                System.out.println("------------------------------------");
                System.out.println("NR1");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");

            } else if (tarif.getPreisProMonat() <= two) {
                one = tarif.getPreisProMonat();
                second = tarif;
                System.out.println("------------------------------------");
                System.out.println("NR2");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");

            } else if (tarif.getPreisProMonat() <= three) {
                one = tarif.getPreisProMonat();
                third = tarif;
                System.out.println("------------------------------------");
                System.out.println("NR3 ");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }
        }

    }
}
