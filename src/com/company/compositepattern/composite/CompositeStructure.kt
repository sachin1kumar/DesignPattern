package com.company.compositepattern.composite

import com.company.compositepattern.component.TeamMember

class CompositeStructure : TeamMember {

    private val list = ArrayList<TeamMember>()

    override fun showMemberDetails() {
        for (member in list) {
            println(member.showMemberDetails())
        }
    }

    fun addMember(teamMember: TeamMember) {
        list.add(teamMember)
    }

    fun removeMember(teamMember: TeamMember) {
        list.remove(teamMember)
    }
}