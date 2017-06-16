package com.mogujie.tt.DB.dao;

import android.database.sqlite.SQLiteDatabase;

import com.mogujie.tt.DB.entity.DepartmentEntity;
import com.mogujie.tt.DB.entity.GroupEntity;
import com.mogujie.tt.DB.entity.MessageEntity;
import com.mogujie.tt.DB.entity.SessionEntity;
import com.mogujie.tt.DB.entity.UserEntity;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig departmentDaoConfig;
    private final DaoConfig userDaoConfig;
    private final DaoConfig groupDaoConfig;
    private final DaoConfig messageDaoConfig;
    private final DaoConfig sessionDaoConfig;

    private final DepartmentDao departmentDao;
    private final UserDao userDao;
    private final GroupDao groupDao;
    private final MessageDao messageDao;
    private final SessionDao sessionDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        departmentDaoConfig = daoConfigMap.get(DepartmentDao.class).clone();
        departmentDaoConfig.initIdentityScope(type);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        groupDaoConfig = daoConfigMap.get(GroupDao.class).clone();
        groupDaoConfig.initIdentityScope(type);

        messageDaoConfig = daoConfigMap.get(MessageDao.class).clone();
        messageDaoConfig.initIdentityScope(type);

        sessionDaoConfig = daoConfigMap.get(SessionDao.class).clone();
        sessionDaoConfig.initIdentityScope(type);

        departmentDao = new DepartmentDao(departmentDaoConfig, this);
        userDao = new UserDao(userDaoConfig, this);
        groupDao = new GroupDao(groupDaoConfig, this);
        messageDao = new MessageDao(messageDaoConfig, this);
        sessionDao = new SessionDao(sessionDaoConfig, this);

        registerDao(DepartmentEntity.class, departmentDao);
        registerDao(UserEntity.class, userDao);
        registerDao(GroupEntity.class, groupDao);
        registerDao(MessageEntity.class, messageDao);
        registerDao(SessionEntity.class, sessionDao);
    }
    
    public void clear() {
        departmentDaoConfig.getIdentityScope().clear();
        userDaoConfig.getIdentityScope().clear();
        groupDaoConfig.getIdentityScope().clear();
        messageDaoConfig.getIdentityScope().clear();
        sessionDaoConfig.getIdentityScope().clear();
    }

    public DepartmentDao getDepartmentDao() {
        return departmentDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public GroupDao getGroupDao() {
        return groupDao;
    }

    public MessageDao getMessageDao() {
        return messageDao;
    }

    public SessionDao getSessionDao() {
        return sessionDao;
    }

}