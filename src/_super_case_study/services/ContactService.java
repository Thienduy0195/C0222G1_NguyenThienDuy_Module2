package _super_case_study.services;

import _super_case_study.services.Service;

public interface ContactService extends Service {
    @Override
    void display();

    @Override
    void addNew();

    @Override
    void edit();

    @Override
    void delete();

    @Override
    void search();
}
