package com.shakil.app

class MemberController {

    MemberService memberService

    def index() {
        def response = memberService.getAllMemberList(params)
        [memberList: response.list, total:response.count]
    }
}
