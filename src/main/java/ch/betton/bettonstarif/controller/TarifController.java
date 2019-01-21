package ch.betton.bettonstarif.controller;

import ch.betton.bettonstarif.model.Tarif;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author bettin
 */
@ManagedBean
@ApplicationScoped
public class TarifController {

    //Diesen Pfad ersetzen --> README.md
    String csvFile = "D:\\OneDrive\\Schule\\Jahr 3\\IDPA\\Handy Tarif\\Betton's Tarife\\src\\main\\java\\ch\\betton\\bettonstarif\\controller\\Tarife.CSV";

    //Alter
    private int age;

    //Dauer (Egal/12/24)
    private int duration = 24;

    //Telefonieren Inland
    private int opinion02 = 9;

    //SMS/MMS Inland 
    private int opinion03 = 9;

    //Daten Inland 
    private int opinion04 = 9;

    //Netzqualität
    private int opinion05 = 9;

    //Telefonieren Ausland
    private int opinion06 = 9;

    //SMS/MMS Ausland 
    private int opinion07 = 9;

    //Daten Ausland
    private int opinion08 = 9;

    private String bgr1;

    private String bgr2;

    private String bgr3;

    private String scm = "Swisscom";

    public String getBgr1() {

        String tmp = "" ;

        if (age <= first.getAlterBeschrenkung()) {

            tmp = "Da Sie noch " + age + " Jahre jung sind, können Sie von diesem Jugend-Tarif Profitieren!\n\n";
        }

        if (first.getAnbieter().equals(scm)) {
            tmp = tmp + "Um das Beste Netz der Schweiz geniessen zu können, wurde der Anbieter Swisscom gewählt. ";
        }

        tmp = tmp + " Der Tarif  " + first.getName() + " von " + first.getAnbieter() + " ist ideal für Sie, da Sie ";

        if (opinion02
                == 0) {
            tmp = tmp + " in der Schweiz keine Telefonate führen, ";
        } else if (opinion02
                == 1) {
            tmp = tmp + " in der Schweiz wenige Telefonate führen, ";
        } else if (opinion02
                == 2) {
            tmp = tmp + " in der Schweiz mässig Telefonate führen, ";
        } else if (opinion02
                == 3) {
            tmp = tmp + " in der Schweiz viele Telefonate führen, ";
        } else if (opinion02
                == 4) {
            tmp = tmp + " in der Schweiz sehr viele Telefonate führen, ";
        }

        if (opinion03
                == 0) {
            tmp = tmp + " keine SMS/MMS versenden und ";
        } else if (opinion03
                == 1) {
            tmp = tmp + " wenige SMS/MMS versenden und ";
        } else if (opinion03
                == 2) {
            tmp = tmp + " mässig SMS/MMS versenden und ";
        } else if (opinion03
                == 3) {
            tmp = tmp + " viele SMS/MMS versenden und ";
        } else if (opinion03
                == 4) {
            tmp = tmp + " sehr viele SMS/MMS versenden und ";
        }

        if (opinion04
                == 0) {
            tmp = tmp + " keine mobilen Daten verbrauchen wollen. ";
        } else if (opinion04
                == 1) {
            tmp = tmp + " wenige mobilen Daten verbrauchen wollen. ";
        } else if (opinion04
                == 2) {
            tmp = tmp + " mässig mobilen Daten verbrauchen wollen. ";
        } else if (opinion04
                == 3) {
            tmp = tmp + " viele mobilen Daten verbrauchen wollen. ";
        } else if (opinion04
                == 4) {
            tmp = tmp + " sehr viele mobilen Daten verbrauchen wollen. ";
        }

        System.out.println(tmp);
        return tmp;
    }

    public void setBgr1(String bgr1) {
        this.bgr1 = bgr1;
    }

    public String getBgr2() {

        String tmp = "" ;

        if (age <= second.getAlterBeschrenkung()) {

            tmp = "Da Sie noch " + age + " Jahre jung sind, können Sie von diesem Jugend-Tarif Profitieren!\n\n";
        }

        if (second.getAnbieter().equals(scm)) {
            tmp = tmp + "Um das Beste Netz der Schweiz geniessen zu können, wurde der Anbieter Swisscom gewählt. ";
        }

        tmp = tmp + " Der Tarif  " + second.getName() + " von " + second.getAnbieter() + " ist ideal für Sie, da Sie ";

        if (opinion02
                == 0) {
            tmp = tmp + " in der Schweiz keine Telefonate führen, ";
        } else if (opinion02
                == 1) {
            tmp = tmp + " in der Schweiz wenige Telefonate führen, ";
        } else if (opinion02
                == 2) {
            tmp = tmp + " in der Schweiz mässig Telefonate führen, ";
        } else if (opinion02
                == 3) {
            tmp = tmp + " in der Schweiz viele Telefonate führen, ";
        } else if (opinion02
                == 4) {
            tmp = tmp + " in der Schweiz sehr viele Telefonate führen, ";
        }

        if (opinion03
                == 0) {
            tmp = tmp + " keine SMS/MMS versenden und ";
        } else if (opinion03
                == 1) {
            tmp = tmp + " wenige SMS/MMS versenden und ";
        } else if (opinion03
                == 2) {
            tmp = tmp + " mässig SMS/MMS versenden und ";
        } else if (opinion03
                == 3) {
            tmp = tmp + " viele SMS/MMS versenden und ";
        } else if (opinion03
                == 4) {
            tmp = tmp + " sehr viele SMS/MMS versenden und ";
        }

        if (opinion04
                == 0) {
            tmp = tmp + " keine mobilen Daten verbrauchen wollen. ";
        } else if (opinion04
                == 1) {
            tmp = tmp + " wenige mobilen Daten verbrauchen wollen. ";
        } else if (opinion04
                == 2) {
            tmp = tmp + " mässig mobilen Daten verbrauchen wollen. ";
        } else if (opinion04
                == 3) {
            tmp = tmp + " viele mobilen Daten verbrauchen wollen. ";
        } else if (opinion04
                == 4) {
            tmp = tmp + " sehr viele mobilen Daten verbrauchen wollen. ";
        }

        System.out.println(tmp);
        return tmp;
    }

    public void setBgr2(String bgr2) {
        this.bgr2 = bgr2;
    }

    public String getBgr3() {

        String tmp = "" ;

        if (age <= third.getAlterBeschrenkung()) {

            tmp = "Da Sie noch " + age + " Jahre jung sind, können Sie von diesem Jugend-Tarif Profitieren!\n\n";
        }

        if (third.getAnbieter().equals(scm)) {
            tmp = tmp + "Um das Beste Netz der Schweiz geniessen zu können, wurde der Anbieter Swisscom gewählt. ";
        }

        tmp = tmp + " Der Tarif  " + third.getName() + " von " + third.getAnbieter() + " ist ideal für Sie, da Sie ";

        if (opinion02
                == 0) {
            tmp = tmp + " in der Schweiz keine Telefonate führen, ";
        } else if (opinion02
                == 1) {
            tmp = tmp + " in der Schweiz wenige Telefonate führen, ";
        } else if (opinion02
                == 2) {
            tmp = tmp + " in der Schweiz mässig Telefonate führen, ";
        } else if (opinion02
                == 3) {
            tmp = tmp + " in der Schweiz viele Telefonate führen, ";
        } else if (opinion02
                == 4) {
            tmp = tmp + " in der Schweiz sehr viele Telefonate führen, ";
        }

        if (opinion03
                == 0) {
            tmp = tmp + " keine SMS/MMS versenden und ";
        } else if (opinion03
                == 1) {
            tmp = tmp + " wenige SMS/MMS versenden und ";
        } else if (opinion03
                == 2) {
            tmp = tmp + " mässig SMS/MMS versenden und ";
        } else if (opinion03
                == 3) {
            tmp = tmp + " viele SMS/MMS versenden und ";
        } else if (opinion03
                == 4) {
            tmp = tmp + " sehr viele SMS/MMS versenden und ";
        }

        if (opinion04
                == 0) {
            tmp = tmp + " keine mobilen Daten verbrauchen wollen. ";
        } else if (opinion04
                == 1) {
            tmp = tmp + " wenige mobilen Daten verbrauchen wollen. ";
        } else if (opinion04
                == 2) {
            tmp = tmp + " mässig mobilen Daten verbrauchen wollen. ";
        } else if (opinion04
                == 3) {
            tmp = tmp + " viele mobilen Daten verbrauchen wollen. ";
        } else if (opinion04
                == 4) {
            tmp = tmp + " sehr viele mobilen Daten verbrauchen wollen. ";
        }

        System.out.println(tmp);
        return tmp;
    }

    public void setBgr3(String bgr3) {
        this.bgr3 = bgr3;
    }

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

    public int getHans() {
        return hans;
    }

    public void setHans(int hans) {
        this.hans = hans;
    }

    Tarif first;
    Tarif second;
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

    //End of variables
    //Start of methods
    private ObservableList<Tarif> tarife = FXCollections.observableArrayList();

    //Füllt die tarife - ObservableList mit einträgen, dies sorgt für eine einfache Beartbarkeit der Tarife
    //durch die Aktualisierung der Tarife.CSV Datei
    public void fillList() {
        int count = 1;
        System.out.println("Liste wird gefüllt");
        tarife.clear();
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

            for (Tarif tarif : tarife) {
                System.out.println("---------------------------------");
                System.out.println(tarif.getAnbieter());
                System.out.println(tarif.getName());
                System.out.println(tarif.getArt());
                System.out.println(tarif.getPreisProMonat());
                System.out.println(tarif.getDatenSpeed());
                System.out.println(tarif.getDatenVolumen());
                System.out.println(tarif.getDatenKosten());
                System.out.println(tarif.getDatenRoamingkosten());
                System.out.println(tarif.getDatenRoamingInklusive());
                System.out.println(tarif.getSmsKosten());
                System.out.println(tarif.getSmsAnzahlInkusive());
                System.out.println(tarif.getMmsKosten());
                System.out.println(tarif.getMmsAnzahlInkusive());
                System.out.println(tarif.getAnrufeKostenAuslandEmpfangen());
                System.out.println(tarif.getAnrufeKostenAuslandOrtsgespraeche());
                System.out.println(tarif.getAnrufeKostenAuslandInSchweiz());
                System.out.println(tarif.getAnrufeKostenAuslandAusSchweiz());
                System.out.println(tarif.getAnrufeAnzahlInklusiveAuslandAusSchweiz());
                System.out.println(tarif.getSmsKostenAuslandSundE());
                System.out.println(tarif.getSmsAnzahlInklusiveAuslandSundE());
                System.out.println(tarif.getMmsKostenAuslandSundE());
                System.out.println(tarif.getAlterBeschrenkung());
                System.out.println(tarif.getBoni());
                System.out.println(tarif.getMindestlaufzeit());
                System.out.println(tarif.getAktivierungsbedingungen());
                System.out.println(tarif.getAktivierungskosten());
                System.out.println(tarif.getDatenInlandIndex());
                System.out.println(tarif.getDatenAuslandIndex());
                System.out.println(tarif.getsMSMMSInlandIndex());
                System.out.println(tarif.getsMSMMSAuslandIndex());
                System.out.println(tarif.getAnrufAuslandIndex());
                System.out.println(tarif.getAnrufInlandIndex());

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

    //Testet ob die Daten eingetragen sind
    public void testDaten() {
        System.out.println("------------------------------------");
        System.out.println("Alter: " + age);
        System.out.println("Dauer: " + duration);
        System.out.println("T Inland: " + opinion02);
        System.out.println("SMS/MMS Inland: " + opinion03);
        System.out.println("Daten Inland: " + opinion04);
        System.out.println("Netz: " + opinion04);
        System.out.println("T Ausland: " + opinion06);
        System.out.println("SMS/MMS Ausland: " + opinion07);
        System.out.println("Daten Ausland: " + opinion08);
        System.out.println("------------------------------------");
    }

    //Filtert alle nicht relevanten Tarife heraus
    public void findRelevant() {
        testDaten();

        for (Tarif tarif : tarife) {
            boolean kill = false;
            if (tarif.getAnrufInlandIndex() < opinion02) {
                kill = true;
                System.out.println("------------------------------------");
                System.out.println("nicht genug anrufe inland");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");

            }

            if (tarif.getDatenInlandIndex() < opinion04) {
                kill = true;
                System.out.println("------------------------------------");
                System.out.println("nicht genug dDaten inland");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }

            if (tarif.getsMSMMSInlandIndex() < opinion03) {
                kill = true;
                System.out.println("------------------------------------");
                System.out.println("nicht genug SMS/MMS inland");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }

            if (tarif.getAnbieter().equals(scm) == false) {
                System.out.println("Nicht " + scm);
                if (opinion05 == 1) {
                    kill = true;
                    System.out.println("------------------------------------");
                    System.out.println("nicht genug netz");
                    System.out.println(tarif.getAnbieter() + ": ");
                    System.out.print(tarif.getName());
                    System.out.println("------------------------------------");
                }

            }

            if (age > tarif.getAlterBeschrenkung()) {
                if (tarif.getAlterBeschrenkung() == 0) {

                } else {

                    kill = true;
                    System.out.println("------------------------------------");
                    System.out.println("nicht jung genug");
                    System.out.println(tarif.getName());
                    System.out.println("------------------------------------");
                }
            }

            if (tarif.getMindestlaufzeit().equals(duration) != true) {
                if (duration == 0) {
                } else {
                    kill = true;
                    System.out.println("------------------------------------");
                    System.out.println("nicht richtige mindestlaufzeit");
                    System.out.println(tarif.getName());
                    System.out.println("------------------------------------");
                }
            }

            if (tarif.getAnrufAuslandIndex() < opinion06) {
                kill = true;

                System.out.println("------------------------------------");
                System.out.println("nicht genug anrufe ausland");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }

            if (tarif.getsMSMMSAuslandIndex() < opinion07) {
                kill = true;
                System.out.println("------------------------------------");
                System.out.println("nicht genug SMS/MMS ausland");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }

            if (tarif.getDatenAuslandIndex() < opinion08) {
                kill = true;
                System.out.println("------------------------------------");
                System.out.println("nicht genug daten ausland");
                System.out.println(tarif.getName());
                System.out.println("------------------------------------");
            }
            System.out.println("-~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            if (kill) {
                System.out.println("+++++++++++++++++++++++++");
                System.out.println("Kill:");
                System.out.println(tarif.getName());
                System.out.println("+++++++++++++++++++++++++");
                tarif.setKill(true);
            }
        }

        System.out.println("////////////////////////");
        System.out.println("Relevante:");

        for (Tarif tarif : tarife) {
            if (tarif.getKill() == false) {
                System.out.println(tarif.getName());
            }

        }

        System.out.println("////////////////////////");

        findTopThree();
    }

    //Filter die drei günstigsten Tarife heraus
    public void findTopThree() {

        int count = 0;
        Double one = 10000.0;
        Double two = 10000.0;
        Double three = 10000.0;
        System.out.println("Top dreis Ausgeführt");

        for (Tarif tarif : tarife) {
            if (tarif.getKill() == false) {
                count++;
            }
        }
        System.out.println("###########################");
        System.out.println(count);
        System.out.println("###########################");
        if (count > 2) {

            for (Tarif tarif : tarife) {

                if (tarif.getKill() == false) {

                    if (tarif.getPreisProMonat() <= one) {

                        three = two;
                        two = one;
                        one = tarif.getPreisProMonat();

                        third = second;
                        second = first;
                        first = tarif;

                        one = first.getPreisProMonat();
                        System.out.println("------------------------------------");
                        System.out.println("set NR1");
                        System.out.println(first.getName());
                        System.out.println(first.getPreisProMonat());
                        System.out.println("------------------------------------");

                    } else if (tarif.getPreisProMonat() <= two) {

                        three = two;
                        two = tarif.getPreisProMonat();

                        third = second;
                        second = tarif;

                        System.out.println("------------------------------------");
                        System.out.println("set NR2");
                        System.out.println(second.getName());
                        System.out.println(second.getPreisProMonat());
                        System.out.println("------------------------------------");

                    } else if (tarif.getPreisProMonat() <= three) {

                        three = tarif.getPreisProMonat();
                        third = tarif;

                        System.out.println("------------------------------------");
                        System.out.println("set NR3 ");
                        System.out.println(third.getName());
                        System.out.println(third.getPreisProMonat());
                        System.out.println("------------------------------------");
                    }
                }
            }

            System.out.println("123--------------------123");
            System.out.println("Bester: " + first.getName() + " " + first.getPreisProMonat());
            System.out.println("Bester: " + second.getName() + " " + second.getPreisProMonat());
            System.out.println("Bester: " + third.getName() + " " + third.getPreisProMonat());
        } else {
            System.out.println("ERROR NICHT GENUG TARIFE");
        }

    }

    //Alle opinions mit Ausland = 0
    public void keinAusland() {
        opinion06 = 0;
        opinion07 = 0;
        opinion08 = 0;

        testDaten();

        findRelevant();
    }
}
