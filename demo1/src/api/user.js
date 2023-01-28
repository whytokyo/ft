import request from '../utils/request.js'

// 查询用户列表
export function listUser(query) {
    return request({
        url: '/system/user/list',
        method: 'get',
        params: query
    })
}

// export function addUser(ruleForm) {
//     return request({
//         url: '/system/user/add',
//         method: 'post',
//         params: ruleForm
//     })
// }

export function addUser(data) {
    // const data = {
    //     userId,
    //     deptId,
    //     userName,
    //     nickName,
    //     password
    // }
    return request({
        url: '/system/user/add',
        method:  'put',
        data: data
    })
}
