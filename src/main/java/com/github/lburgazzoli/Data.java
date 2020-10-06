package com.github.lburgazzoli;

public class Data {
    private User user;
    private Report report;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    @Override
    public String toString() {
        return "Data{" +
            "user=" + user +
            ", report=" + report +
            '}';
    }

    public static class User {
        private String name;
        private String token;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        @Override
        public String toString() {
            return "User{" +
                "name='" + name + '\'' +
                ", token='" + token + '\'' +
                '}';
        }
    }

    public static class Report {
        private String type;
        private String measurement;
        private boolean alert;
        private String location;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getMeasurement() {
            return measurement;
        }

        public void setMeasurement(String measurement) {
            this.measurement = measurement;
        }

        public boolean isAlert() {
            return alert;
        }

        public void setAlert(boolean alert) {
            this.alert = alert;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        @Override
        public String toString() {
            return "Report{" +
                "type='" + type + '\'' +
                ", measurement='" + measurement + '\'' +
                ", alert=" + alert +
                ", location='" + location + '\'' +
                '}';
        }
    }
}